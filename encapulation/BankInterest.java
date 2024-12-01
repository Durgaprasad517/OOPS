package com.encapulation;

public class BankInterest {
	int sum;
    String name;
	int time;
	double intrestrate;
	public BankInterest() {
		
	}
	public BankInterest(int sum, String name, int time, double intrestrate) {
		super();
		this.sum = sum;
		this.name = name;
		this.time = time;
		this.intrestrate = intrestrate;
	}
	public double calculate() {
	return ((sum * time * intrestrate)/100);
	}
	public double totalamount() {
		return sum+calculate();
}
    public void display() {
    	System.out.println("Sum : "+name );
    	System.out.println("Time : "+time);
    	System.out.println("intrestrate : "+intrestrate);
    	System.out.println("The account holder name is : "+calculate());
    	System.out.println("TOTALAMOUNT:"+totalamount());
    }
    public static void main(String[] args) {
    	BankInterest bank=new BankInterest(20000,"prasad",2,2);
    	bank.display();           
    	
	}
}
