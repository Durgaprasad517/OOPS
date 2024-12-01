package com.inhertance;

public class Main {
	public static void main(String[] args) {
		ContractEmployee c = new ContractEmployee();
		c.setId(101);
		c.setName("prasad");
		c.setSal(25000.00);
		c.setContractDuration(10);
		c.setHourlyRate(25.00);
		c.displayContractDetails();
		c.work();
		System.out.println("__________________________________");
		
		RegularEmployee r = new RegularEmployee();
		r.setId(102);
		r.setName("balaji");
		r.setSal(20000.00);
		r.setBonus(5000);
		r.setBenefits("food,bed,health insurance"); 
		r.displayRegularDetails();
		r.work();
		
	}

}
