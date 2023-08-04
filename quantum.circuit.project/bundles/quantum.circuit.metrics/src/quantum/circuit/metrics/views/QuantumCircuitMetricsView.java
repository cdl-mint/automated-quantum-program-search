//package quantum.circuit.metrics.views;
//
//
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.ui.part.*;
//
//import qucircuit.QuantumCircuit;
//
//import org.eclipse.jface.viewers.*;
//import org.eclipse.sirius.diagram.DSemanticDiagram;
//import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
//import org.eclipse.swt.graphics.Image;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.jface.action.*;
//import org.eclipse.jface.dialogs.MessageDialog;
//import org.eclipse.ui.*;
//import org.eclipse.swt.widgets.Menu;
//import org.eclipse.swt.widgets.Table;
//import org.eclipse.swt.widgets.TableColumn;
//import org.eclipse.swt.SWT;
//import javax.inject.Inject;
//
//
//
///**
// * This sample class demonstrates how to plug-in a new
// * workbench view. The view shows data obtained from the
// * model. The sample creates a dummy model on the fly,
// * but a real implementation would connect to the model
// * available either in this or another plug-in (e.g. the workspace).
// * The view is connected to the model using a content provider.
// * <p>
// * The view uses a label provider to define how model
// * objects should be presented in the view. Each
// * view can present the same model objects using
// * different labels and icons, if needed. Alternatively,
// * a single label provider can be shared between views
// * in order to ensure that objects of the same type are
// * presented in the same way everywhere.
// * <p>
// */
//
//public class QuantumCircuitMetricsView extends ViewPart {
//
//	/**
//	 * The ID of the view as specified by the extension.
//	 */
//	public static final String ID = "quantum.circuit.metrics.views.QuantumCircuitMetricsView";
//
//	@Inject IWorkbench workbench;
//	
//	private TableViewer viewer;
//	private Action action1;
//	private Action action2;
//	private Action doubleClickAction;
//	 
//
//	@Override
//	public void createPartControl(Composite parent) {
//		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
//		// Create the columns
//		createColumns(parent, viewer);
//				
//		final Table table = viewer.getTable();
//        table.setHeaderVisible(true);
//        table.setLinesVisible(true);
//        
//        viewer.setContentProvider(ArrayContentProvider.getInstance());        
//        // contentProvider
//        viewer.setInput(new MetricProvider(getQuantumCircuit()).getMetrics());
//
//		// Create the help context id for the viewer's control
//		workbench.getHelpSystem().setHelp(viewer.getControl(), "quantum.circuit.metrics.viewer");
//		getSite().setSelectionProvider(viewer);
//		makeActions();
//		hookContextMenu();
//		hookDoubleClickAction();
//		contributeToActionBars();
//	}
//	
//	private QuantumCircuit getQuantumCircuit() {
//		DDiagramEditor diagram = getActiveSiriusDiagram();
//		var representation = diagram.getRepresentation();
//		if (representation instanceof DSemanticDiagram) {
//			var semanticDiag = (DSemanticDiagram) representation;
//			var target = semanticDiag.getTarget();
//			if (target instanceof QuantumCircuit) {
//				return (QuantumCircuit) target;
//			} 			
//		}		
//		return null;
//	}
//	
//	public static final DDiagramEditor getActiveSiriusDiagram() {
//		IWorkbench wb = PlatformUI.getWorkbench();
//		IEditorPart editorPart = wb.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
//		if (editorPart instanceof DDiagramEditor)
//			return (DDiagramEditor) editorPart;
//		return null;
//	}
//
//	private void createColumns(Composite parent, TableViewer tableViewer) {
//		String[] titles = {"Metric Name", "Value", "Description"};
//        int[] bounds = { 100, 100};
//        // First column is for the metric name
//        TableViewerColumn col = createTableViewerColumn(titles[0], bounds[0], 0);
//        col.setLabelProvider(new ColumnLabelProvider() {
//            @Override
//            public String getText(Object element) {
//                Metric m = (Metric) element;
//                return m.getMetricName();
//            }
//        });
//        
//        // Second column is for the metric value
//        col = createTableViewerColumn(titles[1], bounds[1], 1);
//        col.setLabelProvider(new ColumnLabelProvider() {
//            @Override
//            public String getText(Object element) {
//            	Metric m = (Metric) element;
//                return m.getValue();
//            }
//        });  
//        
//        // Third column is for the Description
//        col = createTableViewerColumn(titles[1], bounds[1], 1);
//        col.setLabelProvider(new ColumnLabelProvider() {
//            @Override
//            public String getText(Object element) {
//            	Metric m = (Metric) element;
//                return m.getDescription();
//            }
//        });          
//	}
//
//	private TableViewerColumn createTableViewerColumn(String title, int bound, int colNumber) {
//		final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,
//                SWT.NONE);
//        final TableColumn column = viewerColumn.getColumn();
//        column.setText(title);
//        column.setWidth(bound);
//        column.setResizable(true);
//        column.setMoveable(true);
//        return viewerColumn;
//	}
//
//	private void hookContextMenu() {
//		MenuManager menuMgr = new MenuManager("#PopupMenu");
//		menuMgr.setRemoveAllWhenShown(true);
//		menuMgr.addMenuListener(new IMenuListener() {
//			public void menuAboutToShow(IMenuManager manager) {
//				QuantumCircuitMetricsView.this.fillContextMenu(manager);
//			}
//		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
//	}
//
//	private void contributeToActionBars() {
//		IActionBars bars = getViewSite().getActionBars();
//		fillLocalPullDown(bars.getMenuManager());
//		fillLocalToolBar(bars.getToolBarManager());
//	}
//
//	private void fillLocalPullDown(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(new Separator());
//		manager.add(action2);
//	}
//
//	private void fillContextMenu(IMenuManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//		// Other plug-ins can contribute there actions here
//		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
//	}
//	
//	private void fillLocalToolBar(IToolBarManager manager) {
//		manager.add(action1);
//		manager.add(action2);
//	}
//
//	private void makeActions() {
//		action1 = new Action() {
//			public void run() {
//				showMessage("Action 1 executed");
//			}
//		};
//		action1.setText("Action 1");
//		action1.setToolTipText("Action 1 tooltip");
//		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
//			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		
//		action2 = new Action() {
//			public void run() {
//				showMessage("Action 2 executed");
//			}
//		};
//		action2.setText("Action 2");
//		action2.setToolTipText("Action 2 tooltip");
//		action2.setImageDescriptor(workbench.getSharedImages().
//				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
//		doubleClickAction = new Action() {
//			public void run() {
//				IStructuredSelection selection = viewer.getStructuredSelection();
//				Object obj = selection.getFirstElement();
//				showMessage("Double-click detected on "+obj.toString());
//			}
//		};
//	}
//
//	private void hookDoubleClickAction() {
//		viewer.addDoubleClickListener(new IDoubleClickListener() {
//			public void doubleClick(DoubleClickEvent event) {
//				doubleClickAction.run();
//			}
//		});
//	}
//	private void showMessage(String message) {
//		MessageDialog.openInformation(
//			viewer.getControl().getShell(),
//			"Quantum Circuit Metrics ",
//			message);
//	}
//
//	@Override
//	public void setFocus() {
//		viewer.getControl().setFocus();
//	}
//}
