#elementary Quantum Gates
from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
from qiskit.circuit import Gate
import numpy as np
from numpy.random import choice, random as rand, randint

class ElementaryGate:
    def __init__(self):
        self.type="ElementaryGate"
        
    def rx_gate(self,target_qubits, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.rx(theta, i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
        
    def hadamard(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.h(i)
        gate = qc.to_gate()
        gate.label="Had"
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def x_gate(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.x(i)
        gate = qc.to_gate()
        gate.label="X"
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def swap(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.swap(0,1)
        swap=qc.to_gate()
        swap.label="Swap"
        return swap
    
    def cnot(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.cnot(0,1)
        cnot=qc.to_gate()
        cnot.label="CNOT"
        return cnot
    
    def p_gate(self,theta, target_qubits, control_qubits=None, inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.p(theta, i)
        gate = qc.to_gate()
        if inverse==True:
            gate=gate.inverse()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        return gate
    
    # ab hier neue gates
    def cz(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.cz(0,1)
        cz=qc.to_gate()
        cz.label="CZ"
        return cz
    
    def y_gate(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.y(i)
        gate = qc.to_gate()
        gate.label="Y"
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def z_gate(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.z(i)
        gate = qc.to_gate()
        gate.label="Z"
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def sx_gate(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.sx(i)
        gate = qc.to_gate()
        gate.label="SX"
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def cy(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.cy(0,1)
        cy=qc.to_gate()
        cy.label="CY"
        return cy
    
    def rz_gate(self,target_qubits, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.rz(theta, i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def ry_gate(self,target_qubits, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.ry(theta, i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def u_gate(self,target_qubits, control_qubits=None, theta=None, phi=None, lamb=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if phi==None:
            phi=2*np.pi*rand(1)[0]
        if lamb==None:
            lamb=2*np.pi*rand(1)[0]    
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.u(theta, phi, lamb, i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def rzz(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.rzz(theta, 0,1)
        rzz=qc.to_gate()
        rzz.label="RZZ"
        return rzz
    
    def rxx(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.rxx(theta, 0,1)
        rxx=qc.to_gate()
        rxx.label="RXX"
        return rxx
    
    def ryy(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.ryy(theta, 0,1)
        ryy=qc.to_gate()
        ryy.label="RYY"
        return ryy
    
    def crx(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.crx(theta, 0,1)
        crx=qc.to_gate()
        crx.label="CRX"
        return crx
    
    def cry(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.cry(theta, 0,1)
        cry=qc.to_gate()
        cry.label="CRY"
        return cry
    
    def crz(self,target_qubits=None, control_qubits=None, theta=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.crz(theta, 0,1)
        crz=qc.to_gate()
        crz.label="CRZ"
        return crz
    
    def cp(self,target_qubits=None, control_qubits=None, theta = None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        qc=QuantumCircuit(2)
        qc.cp(theta, 0,1)
        cp=qc.to_gate()
        cp.label="CP"
        return cp
    
    def cu(self, control_qubits=None, theta=None, phi=None, lamb=None, inverse=False):
        if theta==None:
            theta=2*np.pi*rand(1)[0]
        if phi==None:
            phi=2*np.pi*rand(1)[0]
        if lamb==None:
            lamb=2*np.pi*rand(1)[0]    
        qc=QuantumCircuit(2)
        #print(theta, phi, lamb)
        qc.cu3(theta,phi,lamb,0,1)
        cu=qc.to_gate()
        cu.label="CU"
        return cu
    
    def tdg_gate(self,target_qubits, control_qubits=None, inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.tdg(i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def t_gate(self,target_qubits, control_qubits=None,inverse=False):
        if control_qubits==None:
            control_qubits=[]
        qc=QuantumCircuit(len(target_qubits))
        for i in range(len(target_qubits)):
            qc.t(i)
        gate = qc.to_gate()
        if control_qubits!=None:
            for j in range(len(control_qubits)):
                gate=gate.control()
        if inverse==True:
            gate=gate.inverse()
        return gate
    
    def ch(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.ch(0,1)
        ch=qc.to_gate()
        ch.label="CH"
        return ch
    
    def csx(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.csx(0,1)
        csx=qc.to_gate()
        csx.label="CSX"
        return csx
    
    def iswap(self,target_qubits=None, control_qubits=None, inverse=False):
        qc=QuantumCircuit(2)
        qc.iswap(0,1)
        swap=qc.to_gate()
        swap.label="iswap"
        return swap