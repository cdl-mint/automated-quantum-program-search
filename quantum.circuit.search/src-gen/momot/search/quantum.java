package momot.search;

import at.ac.tuwien.big.moea.SearchAnalysis;
import at.ac.tuwien.big.moea.SearchExperiment;
import at.ac.tuwien.big.moea.experiment.analyzer.SearchAnalyzer;
import at.ac.tuwien.big.moea.experiment.executor.listener.SeedRuntimePrintListener;
import at.ac.tuwien.big.moea.print.IPopulationWriter;
import at.ac.tuwien.big.moea.print.ISolutionWriter;
import at.ac.tuwien.big.moea.search.algorithm.EvolutionaryAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.LocalSearchAlgorithmFactory;
import at.ac.tuwien.big.moea.search.algorithm.provider.IRegisteredAlgorithm;
import at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension;
import at.ac.tuwien.big.momot.ModuleManager;
import at.ac.tuwien.big.momot.TransformationResultManager;
import at.ac.tuwien.big.momot.TransformationSearchOrchestration;
import at.ac.tuwien.big.momot.problem.solution.TransformationSolution;
import at.ac.tuwien.big.momot.problem.unit.parameter.IParameterValue;
import at.ac.tuwien.big.momot.problem.unit.parameter.fix.FixValue;
import at.ac.tuwien.big.momot.problem.unit.parameter.increment.IncrementalStringValue;
import at.ac.tuwien.big.momot.problem.unit.parameter.random.RandomDoubleValue;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationPlaceholderMutation;
import at.ac.tuwien.big.momot.search.algorithm.operator.mutation.TransformationVariableMutation;
import at.ac.tuwien.big.momot.search.fitness.EGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.IEGraphMultiDimensionalFitnessFunction;
import at.ac.tuwien.big.momot.search.fitness.dimension.AbstractEGraphFitnessDimension;
import at.ac.tuwien.big.momot.search.solution.executor.SearchHelper;
import at.ac.tuwien.big.momot.search.solution.repair.ITransformationRepairer;
import at.ac.tuwien.big.momot.search.solution.repair.TransformationPlaceholderRepairer;
import at.ac.tuwien.big.momot.util.MomotUtil;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.model.resource.HenshinResourceSet;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.moeaframework.algorithm.NSGAII;
import org.moeaframework.core.Population;
import org.moeaframework.core.operator.TournamentSelection;
import org.moeaframework.core.operator.TwoPointCrossover;
import org.moeaframework.util.progress.ProgressListener;
import quantum.circuit.search.FitnessCalculator;
import qucircuit.CompositeQuantumGate;
import qucircuit.Layer;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QucircuitFactory;
import qucircuit.QucircuitPackage;
import quope.QuopePackage;

@SuppressWarnings("all")
public class quantum {
  protected static final String INITIAL_MODEL = "problem/models/circuit.xmi";

  protected static final int SOLUTION_LENGTH = 2;

  protected final String[] modules = new String[] { "transformations/quantum_ops.henshin" };

  protected final String[] unitsToRemove = new String[] { "quantum_ops::quantum::selectLayer", "quantum_ops::quantum::addElementaryQuantumGateToLayer", "quantum_ops::quantum::addQubitAsTarget", "quantum_ops::quantum::addQubitAsControl", "quantum_ops::quantum::selectControlQubits", "quantum_ops::quantum::selectTargetQubits", "quantum_ops::quantum::selectAvlQubit", "quantum_ops::quantum::addControlQubit", "quantum_ops::quantum::addTargetQubit", "quantum_ops::quantum::getLayer", "quantum_ops::quantum::trueRule", "quantum_ops::quantum::addTargetQubitForGate", "quantum_ops::quantum::addControlQubitForGate", "quantum_ops::quantum::selectCompQuantumGate", "quantum_ops::quantum::addAngleParameter", "quantum_ops::quantum::setAngleParams", "quantum_ops::quantum::setPhi", "quantum_ops::quantum::setTheta", "quantum_ops::quantum::setLambda", "quantum_ops::quantum::checkControlQubitPresent", "quantum_ops::quantum::selectControlQubitsIfPresent" };

  protected final String _parameterValueKey_0 = "quantum_ops::quantum::addElementaryQuantumGateUnit::gateName";

  protected final String _parameterValueKey_1 = "quantum_ops::quantum::addElementaryQuantumGateUnit::maxNoGates";

  protected final String _parameterValueKey_2 = "quantum_ops::quantum::addElementaryQuantumGateUnit::phi";

  protected final String _parameterValueKey_3 = "quantum_ops::quantum::addElementaryQuantumGateUnit::theta";

  protected final String _parameterValueKey_4 = "quantum_ops::quantum::addElementaryQuantumGateUnit::lambda";

  protected final ITransformationRepairer solutionRepairer = new TransformationPlaceholderRepairer();

  protected final int populationSize = 25;

  protected final int maxEvaluations = 5000;

  protected final int nrRuns = 1;

  protected String baseName;

  protected IParameterValue<?> _createParameterValue_0() {
    IncrementalStringValue _incrementalStringValue = new IncrementalStringValue("Orc");
    return _incrementalStringValue;
  }

  protected IParameterValue<?> _createParameterValue_1() {
    FixValue<Integer> _fixValue = new FixValue<Integer>(Integer.valueOf(4));
    return _fixValue;
  }

  protected IParameterValue<?> _createParameterValue_2() {
    RandomDoubleValue _randomDoubleValue = new RandomDoubleValue();
    return _randomDoubleValue;
  }

  protected IParameterValue<?> _createParameterValue_3() {
    RandomDoubleValue _randomDoubleValue = new RandomDoubleValue();
    return _randomDoubleValue;
  }

  protected IParameterValue<?> _createParameterValue_4() {
    RandomDoubleValue _randomDoubleValue = new RandomDoubleValue();
    return _randomDoubleValue;
  }

  protected double _createObjectiveHelper_0(final TransformationSolution solution, final EGraph graph, final EObject root) {
    return FitnessCalculator.overlap(((QuantumCircuit) root));
  }

  protected IFitnessDimension<TransformationSolution> _createObjective_0(final TransformationSearchOrchestration orchestration) {
    return new AbstractEGraphFitnessDimension("Overlap", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Maximum) {
       @Override
       protected double internalEvaluate(TransformationSolution solution) {
          EGraph graph = solution.execute();
          EObject root = MomotUtil.getRoot(graph);
          return _createObjectiveHelper_0(solution, graph, root);
       }
    };
  }

  protected double _createObjectiveHelper_1(final TransformationSolution solution, final EGraph graph, final EObject root) {
    return FitnessCalculator.nrOfGates(((QuantumCircuit) root));
  }

  protected IFitnessDimension<TransformationSolution> _createObjective_1(final TransformationSearchOrchestration orchestration) {
    return new AbstractEGraphFitnessDimension("nrOfGates", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
       @Override
       protected double internalEvaluate(TransformationSolution solution) {
          EGraph graph = solution.execute();
          EObject root = MomotUtil.getRoot(graph);
          return _createObjectiveHelper_1(solution, graph, root);
       }
    };
  }

  protected double _createObjectiveHelper_2(final TransformationSolution solution, final EGraph graph, final EObject root) {
    return FitnessCalculator.depth(((QuantumCircuit) root));
  }

  protected IFitnessDimension<TransformationSolution> _createObjective_2(final TransformationSearchOrchestration orchestration) {
    return new AbstractEGraphFitnessDimension("Depth", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
       @Override
       protected double internalEvaluate(TransformationSolution solution) {
          EGraph graph = solution.execute();
          EObject root = MomotUtil.getRoot(graph);
          return _createObjectiveHelper_2(solution, graph, root);
       }
    };
  }

  protected double _createObjectiveHelper_3(final TransformationSolution solution, final EGraph graph, final EObject root) {
    return FitnessCalculator.nrOfNonlocalGates(((QuantumCircuit) root));
  }

  protected IFitnessDimension<TransformationSolution> _createObjective_3(final TransformationSearchOrchestration orchestration) {
    return new AbstractEGraphFitnessDimension("nrOfNonlocalGates", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
       @Override
       protected double internalEvaluate(TransformationSolution solution) {
          EGraph graph = solution.execute();
          EObject root = MomotUtil.getRoot(graph);
          return _createObjectiveHelper_3(solution, graph, root);
       }
    };
  }

  protected double _createObjectiveHelper_4(final TransformationSolution solution, final EGraph graph, final EObject root) {
    return FitnessCalculator.nrOfParams(((QuantumCircuit) root));
  }

  protected IFitnessDimension<TransformationSolution> _createObjective_4(final TransformationSearchOrchestration orchestration) {
    return new AbstractEGraphFitnessDimension("nrOfParams", at.ac.tuwien.big.moea.search.fitness.dimension.IFitnessDimension.FunctionType.Minimum) {
       @Override
       protected double internalEvaluate(TransformationSolution solution) {
          EGraph graph = solution.execute();
          EObject root = MomotUtil.getRoot(graph);
          return _createObjectiveHelper_4(solution, graph, root);
       }
    };
  }

  protected ModuleManager createModuleManager() {
    ModuleManager manager = new ModuleManager();
    for(String module : modules) {
       manager.addModule(URI.createFileURI(new File(module).getPath().toString()).toString());
    }
    manager.removeUnits(unitsToRemove);
    manager.setParameterValue(_parameterValueKey_0, _createParameterValue_0());
    manager.setParameterValue(_parameterValueKey_1, _createParameterValue_1());
    manager.setParameterValue(_parameterValueKey_2, _createParameterValue_2());
    manager.setParameterValue(_parameterValueKey_3, _createParameterValue_3());
    manager.setParameterValue(_parameterValueKey_4, _createParameterValue_4());
    return manager;
  }

  protected IEGraphMultiDimensionalFitnessFunction createFitnessFunction(final TransformationSearchOrchestration orchestration) {
    IEGraphMultiDimensionalFitnessFunction function = new EGraphMultiDimensionalFitnessFunction();
    function.addObjective(_createObjective_0(orchestration));
    function.addObjective(_createObjective_1(orchestration));
    function.addObjective(_createObjective_2(orchestration));
    function.addObjective(_createObjective_3(orchestration));
    function.addObjective(_createObjective_4(orchestration));
    function.setSolutionRepairer(solutionRepairer);
    return function;
  }

  protected IRegisteredAlgorithm<NSGAII> _createRegisteredAlgorithm_0(final TransformationSearchOrchestration orchestration, final EvolutionaryAlgorithmFactory<TransformationSolution> moea, final LocalSearchAlgorithmFactory<TransformationSolution> local) {
    TournamentSelection _tournamentSelection = new TournamentSelection(2);
    TwoPointCrossover _twoPointCrossover = new TwoPointCrossover(0.8);
    TransformationPlaceholderMutation _transformationPlaceholderMutation = new TransformationPlaceholderMutation(0.05);
    SearchHelper _searchHelper = orchestration.getSearchHelper();
    TransformationVariableMutation _transformationVariableMutation = new TransformationVariableMutation(_searchHelper, 0.2);
    IRegisteredAlgorithm<NSGAII> _createNSGAIII = moea.createNSGAIII(_tournamentSelection, _twoPointCrossover, _transformationPlaceholderMutation, _transformationVariableMutation);
    return _createNSGAIII;
  }

  protected ProgressListener _createListener_0() {
    SeedRuntimePrintListener _seedRuntimePrintListener = new SeedRuntimePrintListener();
    return _seedRuntimePrintListener;
  }

  protected EGraph createInputGraph(final String initialGraph, final ModuleManager moduleManager) {
    EGraph graph = moduleManager.loadGraph(initialGraph);
    return adaptInputGraph(moduleManager, graph);
  }

  protected EGraph adaptInputGraph(final ModuleManager moduleManager, final EGraph initialGraph) {
    EGraph problemGraph = MomotUtil.copy(initialGraph);
    EObject root = MomotUtil.getRoot(problemGraph);
    return MomotUtil.createEGraph(adaptInputModel(root));
  }

  protected EObject adaptInputModel(final EObject root) {
    int maxNumberOfLayers = 4;
    QuantumCircuit cm = ((QuantumCircuit) root);
    final Function1<QuantumOperation, Boolean> _function = new Function1<QuantumOperation, Boolean>() {
      public Boolean apply(final QuantumOperation quOpe) {
        return Boolean.valueOf((quOpe instanceof CompositeQuantumGate));
      }
    };
    QuantumOperation _get = ((QuantumOperation[])Conversions.unwrapArray(IterableExtensions.<QuantumOperation>filter(cm.getLayers().get(1).getQuantumOperations(), _function), QuantumOperation.class))[0];
    CompositeQuantumGate oracle = ((CompositeQuantumGate) _get);
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, maxNumberOfLayers, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Layer newLayer = QucircuitFactory.eINSTANCE.createLayer();
        newLayer.setName(("L" + Integer.valueOf(((i).intValue() + 2))));
        oracle.getLayers().add(newLayer);
      }
    }
    return cm;
  }

  protected TransformationSearchOrchestration createOrchestration(final String initialGraph, final int solutionLength) {
    TransformationSearchOrchestration orchestration = new TransformationSearchOrchestration();
    ModuleManager moduleManager = createModuleManager();
    EGraph graph = createInputGraph(initialGraph, moduleManager);
    orchestration.setModuleManager(moduleManager);
    orchestration.setProblemGraph(graph);
    orchestration.setSolutionLength(solutionLength);
    orchestration.setFitnessFunction(createFitnessFunction(orchestration));
    
    EvolutionaryAlgorithmFactory<TransformationSolution> moea = orchestration.createEvolutionaryAlgorithmFactory(populationSize);
    LocalSearchAlgorithmFactory<TransformationSolution> local = orchestration.createLocalSearchAlgorithmFactory();
    orchestration.addAlgorithm("NSGAIII", _createRegisteredAlgorithm_0(orchestration, moea, local));
    
    return orchestration;
  }

  protected SearchExperiment<TransformationSolution> createExperiment(final TransformationSearchOrchestration orchestration) {
    SearchExperiment<TransformationSolution> experiment = new SearchExperiment<TransformationSolution>(orchestration, maxEvaluations);
    experiment.setNumberOfRuns(nrRuns);
    experiment.addProgressListener(_createListener_0());
    return experiment;
  }

  protected void deriveBaseName(final TransformationSearchOrchestration orchestration) {
    EObject root = MomotUtil.getRoot(orchestration.getProblemGraph());
    if(root == null || root.eResource() == null || root.eResource().getURI() == null)
    	baseName = getClass().getSimpleName();
    else
    	baseName = root.eResource().getURI().trimFileExtension().lastSegment();
  }

  protected double significanceLevel = 0.01;

  protected SearchAnalyzer performAnalysis(final SearchExperiment<TransformationSolution> experiment) {
    SearchAnalysis analysis = new SearchAnalysis(experiment);
    analysis.setHypervolume(true);
    analysis.setGenerationalDistance(true);
    analysis.setShowAggregate(true);
    analysis.setShowIndividualValues(true);
    analysis.setShowStatisticalSignificance(true);
    analysis.setSignificanceLevel(significanceLevel);
    SearchAnalyzer searchAnalyzer = analysis.analyze();
    System.out.println("---------------------------");
    System.out.println("Analysis Results");
    System.out.println("---------------------------");
    searchAnalyzer.printAnalysis();
    System.out.println("---------------------------");
    try {
    	System.out.println("- Save Analysis to 'output/analysis/analysis.txt'");
    	searchAnalyzer.saveAnalysis(new File("output/analysis/analysis.txt"));
    } catch(IOException e) {
    	e.printStackTrace();
    }
    System.out.println("- Save Indicator BoxPlots to 'output/analysis/'");
    searchAnalyzer.saveIndicatorBoxPlots(
    	"output/analysis/",
    	baseName
    );
    return searchAnalyzer;
  }

  protected TransformationResultManager handleResults(final SearchExperiment<TransformationSolution> experiment) {
    ISolutionWriter<TransformationSolution> solutionWriter = experiment.getSearchOrchestration().createSolutionWriter();
    IPopulationWriter<TransformationSolution> populationWriter = experiment.getSearchOrchestration().createPopulationWriter();
    TransformationResultManager resultManager = new TransformationResultManager(experiment);
    Population population;
    population = 
    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
    System.out.println("- Save objectives of all algorithms to 'output/objectives/objective_values.txt'");
    TransformationResultManager.saveObjectives(
    	"output/objectives/objective_values.txt",
    	population
    );
    System.out.println("---------------------------");
    System.out.println("Objectives of all algorithms");
    System.out.println("---------------------------");
    System.out.println(TransformationResultManager.printObjectives(
    	population
    ));
    
    population = 
    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
    System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
    TransformationResultManager.savePopulation(
    	"output/solutions/objective_values.txt",
    	population,
    	populationWriter
    );
    System.out.println("- Save solutions of all algorithms to 'output/solutions/objective_values.txt'");
    TransformationResultManager.saveSolutions(
    	"output/solutions/",
    	baseName,
    	MomotUtil.asIterables(
    		population,
    		TransformationSolution.class),
    	solutionWriter
    );
    
    population = 
    	TransformationResultManager.createApproximationSet(experiment, (String[])null);
    System.out.println("- Save models of all algorithms to 'output/models/'");
    adaptResultModels(TransformationResultManager.saveModels(
    	"output/models/",
    	baseName,
    	population
    ));
    
    return resultManager;
  }

  protected void adaptResultModels(final List<File> modelFiles) {
    HenshinResourceSet set = new HenshinResourceSet();
    for(File file : modelFiles) {
    	EGraph graph = MomotUtil.loadGraph(file.getPath());
    	EObject root = MomotUtil.getRoot(graph);
    	adaptResultModel(root);
    	MomotUtil.saveGraph(graph, file.getPath());
    }
  }

  protected void adaptResultModel(final EObject root) {
    final QuantumCircuit cm = ((QuantumCircuit) root);
    final Function1<QuantumOperation, Boolean> _function = new Function1<QuantumOperation, Boolean>() {
      public Boolean apply(final QuantumOperation quOpe) {
        return Boolean.valueOf((quOpe instanceof CompositeQuantumGate));
      }
    };
    QuantumOperation _get = ((QuantumOperation[])Conversions.unwrapArray(IterableExtensions.<QuantumOperation>filter(cm.getLayers().get(1).getQuantumOperations(), _function), QuantumOperation.class))[0];
    final CompositeQuantumGate oracle = ((CompositeQuantumGate) _get);
    final Function1<Layer, Boolean> _function_1 = new Function1<Layer, Boolean>() {
      public Boolean apply(final Layer l) {
        int _size = l.getQuantumOperations().size();
        return Boolean.valueOf((_size == 0));
      }
    };
    final Iterable<Layer> emptyLayers = IterableExtensions.<Layer>filter(oracle.getLayers(), _function_1);
    CollectionExtensions.<Layer>removeAll(oracle.getLayers(), emptyLayers);
  }

  public void printSearchInfo(final TransformationSearchOrchestration orchestration) {
    System.out.println("-------------------------------------------------------");
    System.out.println("Search");
    System.out.println("-------------------------------------------------------");
    System.out.println("InputModel:      " + INITIAL_MODEL);
    System.out.println("Objectives:      " + orchestration.getFitnessFunction().getObjectiveNames());
    System.out.println("NrObjectives:    " + orchestration.getNumberOfObjectives());
    System.out.println("Constraints:     " + orchestration.getFitnessFunction().getConstraintNames());
    System.out.println("NrConstraints:   " + orchestration.getNumberOfConstraints());
    System.out.println("Transformations: " + Arrays.toString(modules));
    System.out.println("Units:           " + orchestration.getModuleManager().getUnits());
    System.out.println("SolutionLength:  " + orchestration.getSolutionLength());
    System.out.println("PopulationSize:  " + populationSize);
    System.out.println("Iterations:      " + maxEvaluations / populationSize);
    System.out.println("MaxEvaluations:  " + maxEvaluations);
    System.out.println("AlgorithmRuns:   " + nrRuns);
    System.out.println("---------------------------");
  }

  public void performSearch(final String initialGraph, final int solutionLength) {
    TransformationSearchOrchestration orchestration = createOrchestration(initialGraph, solutionLength);
    deriveBaseName(orchestration);
    printSearchInfo(orchestration);
    SearchExperiment<TransformationSolution> experiment = createExperiment(orchestration);
    experiment.run();
    System.out.println("-------------------------------------------------------");
    System.out.println("Analysis");
    System.out.println("-------------------------------------------------------");
    performAnalysis(experiment);
    System.out.println("-------------------------------------------------------");
    System.out.println("Results");
    System.out.println("-------------------------------------------------------");
    handleResults(experiment);
  }

  public static void initialization() {
    QucircuitPackage.eINSTANCE.eClass();
    QuopePackage.eINSTANCE.eClass();
    FitnessCalculator.init(2, "eval-scripts/testenv");
    System.out.println("Search started.");
  }

  public static void finalization() {
    System.out.println("Search finished.");
  }

  public static void main(final String... args) {
    initialization();
    quantum search = new quantum();
    search.performSearch(INITIAL_MODEL, SOLUTION_LENGTH);
    finalization();
  }
}
