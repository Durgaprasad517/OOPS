package com.encapulation;

public class FiveProgramsUsingMethods {  
	public void Primenumbers(int num) {
		int count = 0;
		for(int i=2;i<num;i++) {
			if(i%2 == 0) {
				count++;
			}	
		}if (count == 0) {
			System.out.println("Prime Numbers");
		}else {
			System.out.println("Non prime numbers");
		}
	}
   public void firstNnaturanumbres(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			count+=i;		
		}System.out.println("The first N natural numbers : "+count);
	
	}
	public void fibonicseries(int num) {
	 int a = 0;
	 int b = 1;
	 for(int i=1; i<=num;i++) {
		 num=a+b;
		 System.out.print("The fibonic series is : "+num);
		 a = b;
		 b = num; 
		 
	 }
	}
	public void Reversenumber(int num) {
		int sum = 0;
		while(num>0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}System.out.println("the Revers number is : "+sum);
		
	}
	
	public int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	public int sumOfNumbers(int num) {
		return num * (num + 1) / 2;
	}
	public static void main(String[] args) {
		FiveProgramsUsingMethods e1 = new FiveProgramsUsingMethods();
		e1.Primenumbers(23);
		e1.Reversenumber(143);
		e1.firstNnaturanumbres(35);
		System.out.println("sum of numbers : "+e1.sumOfNumbers(200));
	}
	
	
	
	}

