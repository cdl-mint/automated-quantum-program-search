package quantum.circuit.ui.wizard;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import quantum.circuit.ui.wizard.pages.QuantumCircuitCreationPage;
import quantum.operation.definition.api.utils.QuantumOperationUtils;

public class QuantumCircuitWizard extends Wizard implements INewWizard {
	
	private QuantumCircuitCreationPage mainPage;
	
	public QuantumCircuitWizard() {
		setWindowTitle("Create Quantum Circuit Project");		
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// Do nothing
	}

	@Override
	public void addPages() {
		super.addPages();
		mainPage = new QuantumCircuitCreationPage("Create General Modular Project");	
		addPage(mainPage);
	}
	
	@Override
	public boolean performFinish() {
		createProject(mainPage.getProjectName());		
		return true;
	}
	
	private List<String> getAllNatures() {
		return Arrays.asList("org.eclipse.xtext.ui.shared.xtextNature");
	}
	
	public void createProject(String name) {

		final IWorkspaceRunnable create = new IWorkspaceRunnable() {

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {

				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
				if (project.exists() == false) {

					project.create(null);
					project.open(null);

					//Add Natures
					addAllProjectNatures(project);	
					
					//Create Library of Quantum Gates
					var libraryURI = URI.createPlatformResourceURI(name + "/src-library/quantum-operation.quope",true);
					QuantumOperationUtils.saveLibraryConcreteQuantumOperation(libraryURI);
				}
			}

		};

		try {

			ResourcesPlugin.getWorkspace().run(create, null);

		} catch (CoreException e) {

			e.printStackTrace();
		}
	}
	
	public void addAllProjectNatures(IProject project) {
		
		try {
			IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + getAllNatures().size()];
			
			for (int i = 0; i < getAllNatures().size(); i++) {
				newNatures[natures.length + i] = getAllNatures().get(i);
			}
			
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			description.setNatureIds(newNatures);
			project.setDescription(description, null);
			
		} catch (CoreException e) {
			
			e.printStackTrace();
		}		
	}
}
