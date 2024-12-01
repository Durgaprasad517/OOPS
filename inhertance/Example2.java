package com.inhertance;

public class Example2 extends Example1{
	private String name;

	public Example2(String name) {
		this.name = name;
	}
	public void display() {              
		System.out.println("Holl");
	}
	
public static void main(String[] args) {
	Example2 e=new Example2("prasad");
	e.display();
	
	
	
}
}
