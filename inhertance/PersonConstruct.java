package com.inhertance;

public class PersonConstruct {
	private String name;
	private String designation;
	public PersonConstruct() {
		// TODO Auto-generated constructor stub
	}
	public PersonConstruct(String name,String designation) {
		this.name=name;
		this.designation=designation;
		
	}
	public void display() {
		System.out.println("The name is : "+name);
		System.out.println("The designation is : "+designation);
		
	}

}
