package com.inhertance;

public class MainConstruct {
	public static void main(String[] args) {
    PersonConstruct p = new PersonConstruct("harish","software");
	p.display();
	System.out.println("....................................");
	 
	ProgrammerConstruct u = new ProgrammerConstruct("bhargav", "java developer", "tcs");
	u.details();
	
	
	System.out.println("..................................");
	
	DancerConstruct dancerConstruct = new DancerConstruct(101,"prasad","kathak");
	dancerConstruct.dancerdetails();
	
}

}
