package com.inhertance;

public class EmployeeConstructor {
	private int id;
	private String name;
	private String sal;
	public EmployeeConstructor() {
	}
	public EmployeeConstructor(int id,String name,String sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}
	public void display() {
		System.out.println("the id is : "+id);
		System.out.println("the name is : "+name);
		System.out.println("the  salary : "+sal);
	}
	public void work(){
		System.out.println("The work salary details");
	}

}
