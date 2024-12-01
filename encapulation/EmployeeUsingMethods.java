package com.encapulation;

public class EmployeeUsingMethods {
	 int eid;
	 String ename;
	 static String company;
	public void display() {
		String details = (eid+" "+ename+" "+company);
		System.out.println("The employee details : "+details);
	}
	public static void main(String[] args) {
    EmployeeUsingMethods.company = ("Delotie");          
	EmployeeUsingMethods e1=new EmployeeUsingMethods(); 
    e1.eid = (101);
    e1.ename = ("prasad");
    e1.display();
    EmployeeUsingMethods e3=new EmployeeUsingMethods(); 
    e1.eid = (102);
    e1.ename = ("harish");
    e1.display();
    EmployeeUsingMethods e2=new EmployeeUsingMethods(); 
    e1.eid = (103);
    e1.ename = ("genny");
    e1.display();
}
}
