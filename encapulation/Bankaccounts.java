package com.encapulation;

public class Bankaccounts  {
    private String HolderName;
    private int balance;
    private int rate;
    public Bankaccounts() {
    	
	}
    public Bankaccounts(String HolderName,int balance,int rate) {
    	this.HolderName=HolderName;
    	this.balance=balance;
    	this.rate=rate;
   	}
    public int getbalance() {
    	return balance;    
    }
    public double calculate() {
		return balance*rate;
    	
    }
    public void print() {
    	System.out.println(HolderName+" "+balance+" "+rate);
    }
    public static void main(String[] args) {
    	Bankaccounts bankaccounts=new Bankaccounts("jlsk", 8, 9);
    	bankaccounts.print();
    	
	}
}   






