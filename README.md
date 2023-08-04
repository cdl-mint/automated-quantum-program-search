# Model-Driven Optimization for Quantum Program Synthesis with MOMoT

## About

This project contains a toolset for automated quantum circuit synthesis using the MOMoT framework
and a language for representing Quantum Circuit Design. In particular, it supports to find implementations
for an Oracle in the circuit in order to reach the optimal target state while minimizing the costs. Hence, the search for an implementation is treated an optimization problem. The demonstrated use case concerns the Grover Search algorithm, which allows to performsearches with a quadratic speedup in the time complexity compared to classical approaches ($O(N)$ to $O(\sqrt{N})$).

## Installation steps

- In an Eclipse workspace, import the project "quantum.circuit.project" (and all subprojects)
- Install Xtext

  - Repository site: https://download.eclipse.org/releases/2023-03/
  - "Modeling" -> "Xtext Complete SDK"

- Install Henshin

  - Repository site: https://download.eclipse.org/modeling/emft/henshin/updates/1.8.0/

- Install MOMoT's configuration language

  - Repository site: http://martin-fleck.github.io/momot/eclipse/updates/latest/stable/
  - "MOMoT" -> "MOMoT Configuration Language"

- Install quantum circuit and quantum operator language

  - Run "GenerateQuCircuit.mwe2" in project "qunatum.circuit.lang"
  - Run "GenerateQUBO.mwe2" in project "qubo.lang"

- Run new Eclipse Runtime

  - ensure new runtime is set to launch target platform with all available plugins, also including "at.ac.tuwien.big.momot.lang" and "at.ac.tuwien.big.momot.lang.ui"

- In new runtime, import the experimental setup
  - Import projects "at.ac.tuwien.big.moea", "at.ac.tuwien.big.momot.core", and "quantum.circuit.search"

In order to successfully run the tool including the circuit evaluation, python has to be installed and a conda environment set up accordingly:

- Create new conda environment from "environment.yaml" located in "quantum.circuit.search/eval_scripts"
  - "conda env create --file environment.yaml" (requires conda installed!)
- After installing the environment dependencies, the path to the environment has to be set in the experiment configuration

  - Navigate to momot configuration for the experiment in "quantum.momot" located in "quantum.circuit.search/src"
  - In line 26, replace the 2nd argument ("eval-scripts/testenv") with the string path to your newly created environment

- Run the experiment configuration

  - The setup is configured in "quantum.momot"
  - Run file as "MOMoT search" with additioanl VM argument "--add-opens java.base/java.util=ALL-UNNAMED"

<details>
  <summary>Example Output</summary>
  
  ```
  PyProcess: Initialization done
Search started.
-------------------------------------------------------
Search
-------------------------------------------------------
InputModel:      problem/models/circuit.xmi
Objectives:      [Overlap, nrOfGates, Depth, nrOfNonlocalGates, nrOfParams]
NrObjectives:    5
Constraints:     []
NrConstraints:   0
Transformations: [transformations/quantum_ops.henshin]
Units:           [SequentialUnit addElementaryQuantumGateUnit(inout gateName, inout maxNoGates, inout phi, inout theta, out operation, inout lambda, var cqgName, var layerName, var noTQubits, var noCQubits), Rule reassignTargetQubit(out cqgName, out layerName, var delQbIndex, var newQbIndex), Rule reassignControlQubit(out cqgName, out layerName, var delQbIndex, var newQbIndex)]
SolutionLength:  2
PopulationSize:  25
Iterations:      200
MaxEvaluations:  5000
AlgorithmRuns:   1
---------------------------
Run 'NSGAIII' 1 times...
No intermediate reference points will be generated for the specified number of divisions, recommend increasing divisions
[15:02:20.031] Run 1 of 1 started.
[15:05:11.626] Run 1 of 1 terminated after 0:02:51.593 (171593 ms).
[15:05:11.626] Total runtime for 1 seeds: 0:02:51.595 (171595 ms).
-------------------------------------------------------
Analysis
-------------------------------------------------------
---------------------------
Analysis Results
---------------------------
NSGAIII:
    Hypervolume: 0.0
    GenerationalDistance: 0.0
---------------------------
- Save Analysis to 'output/analysis/analysis.txt'
- Save Indicator BoxPlots to 'output/analysis/'
-------------------------------------------------------
Results
-------------------------------------------------------
- Save objectives of all algorithms to 'output/objectives/objective_values.txt'
---------------------------
Objectives of all algorithms
---------------------------
-1.0 2.0 2.0 2.0 0.0
-0.5 0.0 0.0 0.0 0.0
-0.603553 1.0 1.0 1.0 1.0

- Save solutions of all algorithms to 'output/solutions/objective_values.txt'
- Save solutions of all algorithms to 'output/solutions/objective_values.txt'
- Save models of all algorithms to 'output/models/'
  Search finished.
  ```
  </details>
  ```
