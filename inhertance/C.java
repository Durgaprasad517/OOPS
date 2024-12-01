package com.inhertance;

public class C extends A{
	public int hai(int a,int b) {
		return a+b;
		
	}
	public double hai(double a,double b) {
		return a+b;
		
	}
	
//	public void print() {
//		System.out.println("Welcome to global meet 2023");
//	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
	public void hello() {
		System.out.println("Welcome to all vip");
	}
	public static void main(String[] args) {
	C c=new C();
	System.out.println(c.hai(5, 5));
	System.out.println(c.hai(2.0,5.0));
	c.hello();
	c.print();
	}

}
