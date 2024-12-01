package com.encapulation;

public class MethodsDemo1{
	
	public void doStuff() {
		System.out.println("do Stuff");
	}
	
	public static void doMoreStuff() {
		System.out.println("do More Stuff");
		MethodsDemo1 methodsDemo = new MethodsDemo1();
		methodsDemo.doStuff();
	}
	
	public static void main(String[] args) {
		MethodsDemo1 methodsDemo = new MethodsDemo1();
		methodsDemo.doStuff();
		MethodsDemo1.doMoreStuff();
	}

}