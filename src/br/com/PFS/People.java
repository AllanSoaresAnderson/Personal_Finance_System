package br.com.PFS;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Allan_Anderson
 *
 */
public class People {
	
	private String name;
	private List<Costs> expenses;
	
	
	// Constructor
	public People(String name) {
		this.name = name;
		this.expenses = new ArrayList<Costs>();
	}


	
	// Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	// Lista de despesas
	
	public List<Costs> printExpenses() {
		return expenses;
	}


	public void addexpenses (Costs costs) {
		this.expenses.add(costs);
	}


	// ******************************************************
	@Override
	public String toString() {
		return "People [name=" + name + ", expenses=" + expenses + "]";
	}
	// ******************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	

}
