package com.inhertance;

public class DancerConstruct extends PersonConstruct{
	private int id;
	private String name;
	private String style;
    public DancerConstruct(int id,String name,String style) {
    	this.id=id;
    	this.name=name;
    	this.style=style;
    	
	}
    public void dancerdetails() {
    	System.out.println("The dancer id is: "+id);
    	System.out.println("The dancer name is: "+name);
    	System.out.println("The dancer style is: "+style);
    	
    	
    }
}
