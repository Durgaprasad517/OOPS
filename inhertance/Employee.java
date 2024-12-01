package com.inhertance;

public class Employee {
	private int id;
	private String name;
	private double sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public void display() {
		System.out.println("the id is : "+id);
		System.out.println("the name is : "+name);
		System.out.println("the salary is : "+sal);
		
	}    
   public void work() {
	   System.out.println("welcome to india");
   }
   

   
   

}
