package quantum.circuit.search;

import qucircuit.AngleParameter;

public class AngleParameterRef {
	
	private String name;
	private AngleParameter angleParameter;
	private AngleParameterRef(String name, AngleParameter angleParameter) {
		this.name = name;
		this.angleParameter = angleParameter;
	}
	
	public static AngleParameterRef of(String name, AngleParameter angleParameter) {
		return new AngleParameterRef(name, angleParameter);
	}

	public String getName() {
		return name;
	}

	public AngleParameter getAngleParameter() {
		return angleParameter;
	}

	
	
}
