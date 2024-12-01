package com.inhertance;

public class MainConstructor {
	public static void main(String[] args) {
		ConstractEmployeeConstructor constractEmployeeConstructor = new ConstractEmployeeConstructor(101,"harish","25000",2,5.0);
		constractEmployeeConstructor.displayContractDetails();
		constractEmployeeConstructor.work();
		
		RegularEmployeeConstructor RegularEmployeeConstructor =new RegularEmployeeConstructor(101,"bhargav","30000.0",3000.0,"food");
		RegularEmployeeConstructor.displayRegularDetails();
		RegularEmployeeConstructor.work();
}
}