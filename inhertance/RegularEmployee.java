package com.inhertance;

public class RegularEmployee extends Employee{
	private double bonus;
	private String benefits;
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public void displayRegularDetails() {
		System.out.println("the regular employee details is :");
		super.display();
		System.out.println("the bonus is :"+getBonus());
		System.out.println("the benefits is :"+getBenefits());
	}
	
	
	

}
