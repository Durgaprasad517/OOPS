package com.inhertance;

public class RegularEmployeeConstructor extends EmployeeConstructor {
	private double bonus;
	private String benefits;
	
	
  public RegularEmployeeConstructor(int id,String name,String sal ,double bonus,String benefits) {
	  super(id, name, sal);
	  this.benefits=benefits;
	  this.bonus=bonus; 
  }
  public void displayRegularDetails() {
	  System.out.println("The regular contract details are ");
	  display();
	  System.out.println("The bonus is "+bonus);
	  System.out.println("The benefits are "+benefits);
  }

}
