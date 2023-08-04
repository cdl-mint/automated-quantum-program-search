package quantum.operation.definition;

import java.util.HashMap;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import quope.AbstractQuantumOperation;
import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quope.impl.QuopeFactoryImpl;
import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import quantum.operation.definition.api.IGeneralOperationType;
import quantum.operation.definition.api.ILoopOperationLibrary;
import quantum.operation.definition.api.LibraryQuantumGate;
import quantum.operation.definition.api.utils.QuantumOperationUtils;

public class EvaluateQuantumOperationsContributions {
	
	private static final String QUANTUM_OPERATION = "quantum.operation";
	private static final String QUANTUM_OPERATION_NAME_ATTRIBUTE = "Name";
	
	private static final Logger LOGGER = Logger.getLogger(EvaluateQuantumOperationsContributions.class.getName());
	
	public EvaluateQuantumOperationsContributions() {
		// Do nothing
	}
	
	public AbstractExtendCompositeQuantumGate getQuantumOperationByName(IExtensionRegistry registry, String name) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(QUANTUM_OPERATION);
		for (IConfigurationElement iConfigurationElement : config) {
			 try {
				final Object o = iConfigurationElement.createExecutableExtension("class");
				if (o instanceof AbstractExtendCompositeQuantumGate comp && iConfigurationElement.getAttribute(QUANTUM_OPERATION_NAME_ATTRIBUTE).equals(name)) {
					return comp;
				}
			} catch (CoreException e) {
				LOGGER.severe(e.getMessage()); 
			}			 
		}
		return null;
	}	
	
	public QuantumOperationLibrary execute(IExtensionRegistry registry) {
		var quantumOpe = QuopeFactoryImpl.init().createQuantumOperationLibrary();
		quantumOpe.setName(QuantumOperationUtils.QUANTUM_OPERATION_NAME);
		IConfigurationElement[] config = registry.getConfigurationElementsFor(QUANTUM_OPERATION);
		//All the operations
		EList<AbstractQuantumOperation> operations = ECollections.newBasicEListWithCapacity(config.length);
		//HashMap source the Operation and the value is the reversible quantum gate (Name) 
		var reverseGate = new HashMap<ConcreteQuantumOperation, String>();
		try {
			LOGGER.info("Evaluating extensions");
			for (IConfigurationElement configElement : config) {				
                final Object o = configElement.createExecutableExtension("class");
                if (o instanceof IGeneralOperationType) {
                   executeExtensionConcreteOperation(operations, reverseGate, o, configElement);                   
                }
                if (o instanceof ILoopOperationLibrary ope) {
                	executeExtensionLoopOperation(operations, ope, configElement);
                }
            }
			LOGGER.info("Evaluating Reverse Quantum Gates");
			reverseGate.entrySet().stream()
				.forEach(e -> e.getKey().setReverse(QuantumOperationUtils.getConcreteQuantumOperationByName(operations,e.getValue())));			
		} catch (CoreException ex) {
			LOGGER.severe(ex.getMessage());            
        }
		quantumOpe.getOperations().addAll(operations);
		return quantumOpe;	
	}

	private void executeExtensionLoopOperation(EList<AbstractQuantumOperation> operations, ILoopOperationLibrary o,
			IConfigurationElement configElement) {
		ISafeRunnable runnable = new ISafeRunnable() {
			
			@Override
			public void handleException(Throwable e) {
				LOGGER.severe("Exception in client: " + e.getMessage());    
			}

			@Override
			public void run() throws Exception {
				var loopOperation = QuopeFactoryImpl.init().createConcreteLoopOperation();
				loopOperation.setName(configElement.getAttribute(QUANTUM_OPERATION_NAME_ATTRIBUTE));
				loopOperation.setType(o.getAbstractLoopGate());
				//TODO finish to add the rest of the elements...
				operations.add(loopOperation);				
			}			
		};
		SafeRunner.run(runnable);  
	}

	private void executeExtensionConcreteOperation(EList<AbstractQuantumOperation> operations, HashMap<ConcreteQuantumOperation, String> reverseGate, 
			Object extensionPoint, IConfigurationElement configElement) {
		ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
            	LOGGER.severe("Exception in client: " + e.getMessage());                
            }

            @Override
            public void run() throws Exception {
            	var ope = QuopeFactoryImpl.init().createConcreteQuantumOperation();
            	ope.setName(configElement.getAttribute(QUANTUM_OPERATION_NAME_ATTRIBUTE));           	
                ope.setType(((IGeneralOperationType) extensionPoint).getAbstractQuantumGate());
                ope.setStyleIconPath(((IGeneralOperationType) extensionPoint).getStyleIconPath());
                ope.setPaletteIconPath(((IGeneralOperationType) extensionPoint).getPaletteIconPath());
                if (ope instanceof LibraryQuantumGate libraryQuantumGate) {
                	ope.setParameter(libraryQuantumGate.getParameter());
                	ope.setFixedQuantumOperation(libraryQuantumGate.getFixedQuantumOperators());
                }
                String reverseGateId = ((IGeneralOperationType) extensionPoint).getReverseConcreteQuantumOperation();
                if (reverseGate != null && reverseGate.isEmpty())
                	reverseGate.put(ope, reverseGateId);
                operations.add(ope);
            }
        };
        SafeRunner.run(runnable);        
	}
}
