package quantum.circuit.ui.wizard.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class QuantumCircuitCreationPage extends WizardPage{
	
	private String projectName;
	
	public QuantumCircuitCreationPage(String pageName) {
		super(pageName);	
		this.projectName = "quantum.circuit.sample";
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		
		Label labelProjectName = new Label(container, SWT.NONE);
		labelProjectName.setText("Project Name: ");
		
		Text txtProjectName = new Text(container, SWT.BORDER | SWT.SINGLE );		
		txtProjectName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtProjectName.setText(getProjectName());
		
		txtProjectName.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				
				setProjectName(txtProjectName.getText());
				
				if(txtProjectName.getText().equals(""))					
					setPageComplete(false);				
				else
					setPageComplete(true);			
				
			}
		});
		
		// Required to avoid an error in the system
		setControl(container);
		//TODO check if this project exist on the workspace
		setPageComplete(true);
	}

	private void setProjectName(String projectName) {
		this.projectName = projectName;		
	}
	
	public String getProjectName() {
		return projectName;
	}

}
