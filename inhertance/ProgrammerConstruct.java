package com.inhertance;

public class  ProgrammerConstruct extends PersonConstruct {
	private String companyname;
	
	public ProgrammerConstruct(String name,String designation,String companyname) {
		super(name, designation);
		this.companyname=companyname;
	}
	public void details() {
		display();
		System.out.println("The company name : "+companyname);
	
	}
}
