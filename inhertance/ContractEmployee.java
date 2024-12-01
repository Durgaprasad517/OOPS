package com.inhertance;

public class ContractEmployee extends Employee{
	private int contractDuration ;
	private double hourlyRate;
	public int getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(int contractDuration) {
		this.contractDuration = contractDuration;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
    public void displayContractDetails() {
    	System.out.println("the contract employee details");
    	super.display();
    	System.out.println("the contractduration is "+contractDuration);
    	System.out.println("the hourlyRate is"+hourlyRate);  
    	
    }


}
