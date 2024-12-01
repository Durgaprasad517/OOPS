package com.encapulation;
public class BlockDemo {

	{
		System.out.println("Instance Block");
	}

	static {
		System.out.println("Static Block");
	}

	public void display() {
		System.out.println("display method");
	    {
			System.out.println("Local Block");
		}
	}
	
	public static void main(String[] args) {
		BlockDemo bd1 = new BlockDemo();
		bd1.display();
		
		
	}

}
