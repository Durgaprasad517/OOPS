package com.inhertance;

public class Person {

	private String name;
	private String designation;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
    
	public void eat() {
		System.out.println(name+" Can eat");
	}
	
	public void learn() {
		System.out.println(name+" Can learn");
	}
	
	public void walk() {
		System.out.println(name+" Can Walk");
	}
	



}
