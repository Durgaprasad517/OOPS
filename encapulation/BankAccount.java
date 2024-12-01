package com.encapulation;

public class BankAccount {
	
	 private String accountHolderName;
	 private double balance;
	 private double interestRate; 
	 public BankAccount(String accountHolderName, double balance, double interestRate) {
	 this.accountHolderName = accountHolderName;
	 this.balance = balance;
	 this.interestRate = interestRate;
	 }
	 public double getBalance() {
	 return balance;
	 }  
	 public double calculateInterest() {
	 return (balance * interestRate) / 100;
	 }
	 public void addInterest() {
	 double interest = calculateInterest();
	 balance += interest;
	 System.out.println("Interest added: " + interest);
	 }
	 public void displayAccountDetails() {
	 System.out.println("Account Holder: " + accountHolderName);
	 System.out.println("Current Balance: " + balance);
	 System.out.println("Interest Rate: " + interestRate + "%");
	 }
	 
	 public static void main(String[] args) {
	 BankAccount account = new BankAccount("John Doe", 1000.0, 5.0);
	 account.displayAccountDetails();
	 account.addInterest();
	 System.out.println(account.getBalance());
}
}
