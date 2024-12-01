package com.inhertance;

public class Example4 extends Example1 {
	private int a;

	public Example4(int a) {
		super();
		this.a = a;
	}
	public void display() {
		int a=1;
		System.out.println("nunmer "+this.a);
	}
	public static void main(String[] args) {
		Example4 example4=new Example4(12);
		example4.display();
	}

}
