package quantum.circuit.lang.providers;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionDelta;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.service.OperationCanceledError;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import quope.QuopePackage;

public class QuCircuitResourceServiceProvider implements IResourceServiceProvider {
	
	private SimpleResourceDescriptionsBasedContainerManager containManager;

	public QuCircuitResourceServiceProvider() {
		containManager = new SimpleResourceDescriptionsBasedContainerManager();
	}

	@Override
	public IResourceValidator getResourceValidator() {
		return new IResourceValidator() {
			
			@Override
			public List<Issue> validate(Resource resource, CheckMode mode, CancelIndicator indicator)
					throws OperationCanceledError {
				return Collections.emptyList();
			}
		};
	}

	@Override
	public Manager getResourceDescriptionManager() {
		return new Manager() {
			
			@Override
			public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context)
					throws IllegalArgumentException {
				return false;
			}
			
			@Override
			public boolean isAffected(Delta delta, IResourceDescription candidate) throws IllegalArgumentException {
				return false;
			}
			
			@Override
			public IResourceDescription getResourceDescription(Resource resource) {
				var strat = new DefaultResourceDescriptionStrategy();
				strat.setQualifiedNameProvider(
						new IQualifiedNameProvider() {

							@Override
							public QualifiedName apply(EObject obj) {
								return name(obj);
							}

							@Override
							public QualifiedName getFullyQualifiedName(EObject obj) {
								return name(obj);
							}
							
							private QualifiedName name(EObject obj) {
								return QualifiedName.create(EcoreUtil.getID(obj));
							}
							
						});
								
				return new DefaultResourceDescription(resource, strat);
			}
			
			@Override
			public Delta createDelta(IResourceDescription oldDescription, IResourceDescription newDescription) {
				return new DefaultResourceDescriptionDelta(oldDescription, newDescription);
			}
		};
	}

	@Override
	public org.eclipse.xtext.resource.IContainer.Manager getContainerManager() {
		return this.containManager;
	}

	@Override
	public boolean canHandle(URI uri) {
		return uri.fileExtension().equals(QuopePackage.eNS_PREFIX);
	}

	@Override
	public IEncodingProvider getEncodingProvider() {
		throw new UnsupportedOperationException("Unsupported operation");
	}

	@Override
	public <T> T get(Class<T> t) {
		// Do nothing
		return null;
	}

}
