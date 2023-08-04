package quantum.circuit.qiskit.library;

import quantum.circuit.qiskit.api.QiskitLibrary;
import qucircuit.QuantumCircuit;

public class LoopOperationsUtils implements QiskitLibrary {

	@Override
	public String generateLibraryFile(QuantumCircuit quCircuit) {
		return """
				#Loop Operations
				from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
				from qiskit.circuit import Gate
				import numpy as np
				from numpy.random import choice, random as rand, randint
				
				import Composite_Gates
				import Measurements
				import Elementary_Gates
				import Loop_Operations
				
				class LoopOperation:
				    def __init__(self):
				        self.type="Loop_Operation"
				        
				    @staticmethod
				    def simple_loop(p,gates,target_qubits,control_qubits=None, inverse=False):    
				        if not isinstance(gates, list):
				            gates=[gates]
				        if control_qubits==None:
				            control_qubits=[]
				        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
				        for i in range(p):
				            if control_qubits!=None:
				                for i in gates:
				                    qc.append(i, control_qubits+target_qubits)
				            if control_qubits==None:
				                for i in gates:
				                    qc.append(i, target_qubits)
				        sl_gate=qc.to_instruction()
				        if inverse==True:
				            sl_gate=sl_gate.inverse()
				        return sl_gate
				
				    @classmethod
				    def Power_2_loop(self,gate,target_qubits, control_qubits, increment_c=True, increment_t=True, inverse=False): 
				        #different meaning of increment_t here!!, is not a Boolean
				        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
				        if (increment_t==True):
				            reps=1
				        elif increment_t==False:
				            reps=2**(len(control_qubits)-1)
				        if increment_c==False:
				            control_qubits.reverse()
				
				        for i in (control_qubits):
				            if (increment_t==None):
				                gate1=gate([i])
				                qc.append(gate1,[i]+target_qubits)
				            else:
				                gate1=gate([i])
				                sl_gate=self.simple_loop(reps,gate1,target_qubits,[i])
				                qc.append(sl_gate,qc.qubits)
				            if increment_t==True:
				                reps*=2
				            elif increment_t==False:
				                reps=int(reps/2)
				            else:
				                continue
				
				        ll_gate=qc.to_instruction()
				        if inverse==True:
				            ll_gate=ll_gate.inverse()
				        return ll_gate
				    
				    @staticmethod
				    def general_loop(gate, target_qubits,control_qubits=None,f_tqubits=None,f_cqubits=None,iter_type_t=None,iter_type_c=None,increment_t=True,increment_c=True, 
				                 p=None, block_size_tq=1, block_size_cq=1, incr_block_tq=True, incr_block_cq=True, inverse=False):
				    
				        if control_qubits==None:
				                control_qubits=[]
				        if f_tqubits==None:
				            f_tqubits=[]
				        if f_cqubits==None:
				            f_cqubits=[]
				
				        qc=QuantumCircuit(max(target_qubits+control_qubits)+1)
				        flex_tq = [ele for ele in target_qubits if ele not in f_tqubits]
				        if len(flex_tq)==0:
				            iter_type_t=None
				        flex_cq = [ele for ele in control_qubits if ele not in f_cqubits]
				        if len(flex_cq)==0:
				            iter_type_c=None   
				
				
				        #determine number of iterations p
				        if ((iter_type_t!=None) and (iter_type_c!=None)):
				            if (iter_type_t=="change_block"):
				                p_t=len(flex_tq)-block_size_tq+1
				            elif iter_type_t=="shift":
				                p_t=len(flex_tq)-block_size_tq+1
				            if (iter_type_c=="change_block"):
				                p_c=len(flex_cq)-block_size_cq+1
				            elif iter_type_c=="shift":
				                p_c=len(flex_cq)-block_size_cq+1
				            p1=min(p_t,p_c)
				
				        elif iter_type_t==None and iter_type_c!=None:
				            if (iter_type_c=="change_block"):
				                p1=len(flex_cq)-block_size_cq+1
				            elif iter_type_c=="shift":
				                p1=len(flex_cq)-block_size_cq+1
				
				        elif iter_type_t!=None and iter_type_c==None:
				            if (iter_type_t=="change_block"):
				                p1=len(flex_tq)-block_size_tq+1
				            elif iter_type_t=="shift":
				                p1=len(flex_tq)-block_size_tq+1
				        elif (iter_type_t==None) and (iter_type_c==None):
				            if p==None:
				                print("Error: p has to be specified! It is recommended to use the 'Simple Loop' for this purpose.")
				                return
				            else:
				                p1=p
				
				        if p==None or p>p1:
				            p=p1
				            print("Warning: p determined based on available qubits for iterations!")
				
				        print("Iterations:", p)   
				
				        #implementation of loop
				        if iter_type_t=="change_block":
				            for i in range(p):
				                if incr_block_tq==True:
				                    if increment_t==True:
				                        flex_tq1=flex_tq[:block_size_tq+i]
				                    else:
				                        flex_tq1=flex_tq[len(flex_tq)-block_size_tq-i:]
				                else:
				                    if increment_t==True:
				                        flex_tq1=flex_tq[i:]
				                    else:
				                        flex_tq1=flex_tq[:len(flex_tq)-i]
				
				                target_qubits=flex_tq1+f_tqubits
				
				                if iter_type_c=="change_block":
				                    if incr_block_cq==True:
				                        if increment_c==True:
				                            flex_cq1=flex_cq[:block_size_cq+i]
				                        else:
				                            flex_cq1=flex_cq[len(flex_cq)-block_size_cq-i:]
				                    else:
				                        if increment_c==True:
				                            flex_cq1=flex_cq[i:]
				                        else:
				                            flex_cq1=flex_cq[:len(flex_cq)-i]
				                    control_qubits=flex_cq1+f_cqubits
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
				
				                elif iter_type_c=="shift":
				                    if increment_c==True:
				                        c_qubits=flex_cq[i:block_size_cq+i]
				                    else:
				                        c_qubits=flex_cq[len(flex_cq)-block_size_cq-i:len(flex_cq)-i]
				                    control_qubits=c_qubits+f_cqubits
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
				
				                elif iter_type_c==None:
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
				
								
				        if iter_type_t=="shift":
				            for i in range(p):
				                control_qubits=flex_cq+f_cqubits
				                if increment_t==True:
				                    t_qubits=flex_tq[i:block_size_tq+i]
				                else:
				                    t_qubits=flex_tq[len(flex_tq)-block_size_tq-i:len(flex_tq)-i]
				                target_qubits=t_qubits+f_tqubits
								
				                if iter_type_c=="change_block":
				                    if incr_block_cq==True:
				                        if increment_c==True:
				                            flex_cq1=flex_cq[:block_size_cq+i]
				                        else:
				                            flex_cq1=flex_cq[len(flex_cq)-block_size_cq-i:]
				                    else:
				                        if increment_c==True:
				                            flex_cq1=flex_cq[i:]
				                        else:
				                            flex_cq1=flex_cq[:len(flex_cq)-i]
				                    control_qubits=flex_cq1+f_cqubits
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
					
					
				                elif iter_type_c=="shift":
				                    if increment_c==True:
				                        c_qubits=flex_cq[i:block_size_cq+i]
				                    else:
				                        c_qubits=flex_cq[len(flex_cq)-block_size_cq-i:len(flex_cq)-i]
				                    control_qubits=c_qubits+f_cqubits
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
					
				                elif iter_type_c==None:
				                    gate1=gate(target_qubits,control_qubits)
				                    qc.append(gate1,control_qubits+target_qubits)
					                    
				                if iter_type_t==None:
				                    for i in range(p):
				                        control_qubits=flex_cq+f_cqubits
						  
				                        if iter_type_c=="change_block":
				                            if incr_block_cq==True:
				                                if increment_c==True:
				                                    flex_cq1=flex_cq[:block_size_cq+i]
				                                else:
				                                    flex_cq1=flex_cq[len(flex_cq)-block_size_cq-i:]
				                            else:
				                                if increment_c==True:
				                                    flex_cq1=flex_cq[i:]
				                                else:
				                                    flex_cq1=flex_cq[:len(flex_cq)-i]
				                            control_qubits=flex_cq1+f_cqubits
				                            gate1=gate(target_qubits,control_qubits)
				                            qc.append(gate1,control_qubits+target_qubits)
						
						
				                        elif iter_type_c=="shift":
				                            if increment_c==True:
				                                c_qubits=flex_cq[i:block_size_cq+i]
				                            else:
				                                c_qubits=flex_cq[len(flex_cq)-block_size_cq-i:len(flex_cq)-i]
				                            control_qubits=c_qubits+f_cqubits
				                            gate1=gate(target_qubits,control_qubits)
				                            qc.append(gate1,control_qubits+target_qubits)
						
				                        elif iter_type_c==None:
				                            gate1=gate(target_qubits,control_qubits)
				                            qc.append(gate1,control_qubits+target_qubits)
				        gl_gate=qc.to_instruction()
				        if inverse==True:
				            gl_gate=gl_gate.inverse()
				        return gl_gate       
				""";
	}
	
}
