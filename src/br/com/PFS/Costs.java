package br.com.PFS;




/**
 * @author Allan_Anderson
 *
 */
public class Costs {
	
	private String name;
	private double value;
	
	
	// Constructor
	
	public Costs(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	
	
	// ***************************************************
	@Override
	public String toString() {
		return "Costs [name=" + name + ", value=" + value + "]";
	}
	// ***************************************************

	
	
	
	
	
	
	
	

}
