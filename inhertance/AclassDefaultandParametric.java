package com.inhertance;

public class AclassDefaultandParametric { 
	String a;   
	public AclassDefaultandParametric() {
		
		System.out.println("default consructor"); 
	}
	public AclassDefaultandParametric(String a) {
		this();
		this.a=a;
		
	}
	public void display() {
		
		System.out.println("the a value is "+this.a);
	}

	public static void main(String[] args) {
		AclassDefaultandParametric a=new AclassDefaultandParametric("harish");
		a.display();
	}

	}

	
	
	
	
  


