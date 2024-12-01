package com.encapulation;

public class MethodDemo {

	public void hai() {
		System.out.println("BhargavRam");
	}
	public static void hai2() {
		System.out.println("Saaransh");
		MethodDemo demo=new MethodDemo();
                    demo.hai();
		
	}
	public static void main(String[] args) {
		MethodDemo demo=new MethodDemo();
		MethodDemo.hai2();
		
	}
}
