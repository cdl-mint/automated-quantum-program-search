#!/usr/bin/python
# -*- coding: utf-8 -*-
# script.py


import warnings
def warn(*args, **kwargs):
    pass
import warnings
warnings.warn = warn

from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate, ParameterVector
import numpy as np
import sys
#import other files
import import_ipynb
#import Composite_Gates
#import Loop_Operations
import Elementary_Gates
#import Measurements

from scipy.optimize import minimize
from qiskit.quantum_info import Statevector

settings = {"target": [1,1,1,1,1,-1,-1,1]} # von JSON gelesen
settings["target"] = settings["target"] / np.linalg.norm(settings["target"])
#ToDo: wie weg wenn NON-HYBRID --> num_params normal aber td wird kein quantum_state aufgerufen


def fitness_from_qc(overall, settings, params=True):
    
    qc = overall[0]
    
    num_gates = len(qc.data)
    
    d = qc.depth()

    # number of non-local gates
    nl = qc.num_nonlocal_gates()
    
    # overlap
    if params == False:
        position = 0
        for i in range(len(qc.data)):
            if "barrier" in str(qc.data[i]):
                position = i
        
        qc2 = qc.copy()
        for j in range(len(qc2.data) - position - 1):
            del qc2.data[-1]
        out_state = Statevector.from_instruction(qc2)
        target = np.asarray(settings["target"])
        s = round(np.abs(np.vdot(out_state.data, target)), 6)  # real part ensures phase correct comparison
        p = 0

    else:
        out_state, params, qc = quantum_state(overall, settings)
        target = np.asarray(settings["target"])
        s = round(np.abs(np.vdot(out_state.data, target)), 6)  # real part instead of abs?
        p = len(params)

    # number of parameters given in get_best_circ

    return s, num_gates, d, nl, p, params


#def var_form(settings, qc):
    #out_state = Statevector.from_instruction(qc)

   # return out_state, qc


def get_difference(overall, settings):
    
    def execute_circ(theta, settings, target=None):
        target = target or settings["target"]
        params_vec = overall[1]
        qc = overall[0]
        for i in range(len(theta)):
            qc = qc.bind_parameters({params_vec[i]: theta[i]})
        position = 0
        for i in range(len(qc.data)):
            if "barrier" in str(qc.data[i]):
                position = i
        qc2 = qc.copy()
        for j in range(len(qc2.data) - position - 1):
            del qc2.data[-1]
        state = Statevector.from_instruction(qc2)
        target = np.asarray(target)
        s = np.abs(np.vdot(state.data, target))  # taking real part ensures phase correct comparison
        diff = 1 - s
        return diff

    return execute_circ


# define fitness function
def quantum_state(overall, settings):
    
    method = "COBYLA" #settings["numerical_optimizer"]
    difference = get_difference(overall, settings)
    
    res = minimize(difference, overall[2], args=settings, method=method)
    final_param = list(res.x)
    
    qc = overall[0]
    params_vec = overall[1]
    for i in range(len(final_param)):
            qc = qc.bind_parameters({params_vec[i]: final_param[i]})
    
    position = 0
    for i in range(len(qc.data)):
        if "barrier" in str(qc.data[i]):
            position = i
    qc2 = qc.copy()
    for j in range(len(qc2.data) - position - 1):
        del qc2.data[-1]

    state = Statevector.from_instruction(qc2)
    
    return state, final_param, qc

code_block = ''
termination_marker = '###PYTHON_CODE_END###'
start_marker = '###PYTHON_CODE_START###'


# Read inputs from Java
print('Initialization done')

line = input()
while line != 'exit':
    if line == start_marker:
        code_block = ''
        line = sys.stdin.readline().strip()
        while line != termination_marker:
            code_block += line + '\n'
            line = sys.stdin.readline().strip()

    # Process the inputs

    exec(code_block)

    # Execute the function

    result = fitness_from_qc(overall, settings, params=True)

    # Send the result back to Java

    print(result)
    sys.stdout.flush()  # Flush the output buffer

    # Read the next input from Java

    line = sys.stdin.readline().strip()
