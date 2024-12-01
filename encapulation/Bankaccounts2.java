package com.encapulation;

public class Bankaccounts2  {
    private String HolderName;
    private int balance;
    private int rate;
    public Bankaccounts2() {
	}
    public Bankaccounts2(String HolderName,int balance,int rate) {
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
    	Bankaccounts2 bankaccounts=new Bankaccounts2("jlsk", 8, 9);
    	bankaccounts.print();
    	
	}
}   






