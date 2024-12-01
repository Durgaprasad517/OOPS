package com.inhertance;

public class ConstractEmployeeConstructor extends EmployeeConstructor {
	
	private int contractDuration;
	private double hourlyRate;
	
	
	
	public ConstractEmployeeConstructor(int id,String name,String sal,int contractDuration, double hourlyRate) {
	super(id, name, sal);
		this.contractDuration = contractDuration;
		this.hourlyRate = hourlyRate;
	}



	public void displayContractDetails() {
		System.out.println("The ConstractEmployeeConstructor are");
		display();
		System.out.println("The contractDuration is : "+contractDuration);
		System.out.println("The hourlyRate is : "+hourlyRate);
		
	} 

}
