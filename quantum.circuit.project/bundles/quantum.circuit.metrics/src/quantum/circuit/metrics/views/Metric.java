package quantum.circuit.metrics.views;

public class Metric {
	
	private String metricName;
	private String value;
	private String description;
	
	public Metric(String metricName, String value, String description) {
		super();
		this.metricName = metricName;
		this.value = value;
		this.description = description;
	}
	
	public String getMetricName() {
		return metricName;
	}
	
	public String getValue() {
		return value;
	}	
	
	public String getDescription() {
		return description;
	}
}
