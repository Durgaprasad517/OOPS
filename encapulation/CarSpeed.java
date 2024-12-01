package com.encapulation;

public class CarSpeed {
	private String name;
	private double topspeed;
	public CarSpeed() {
	}
	public CarSpeed(String name,double topspeed) {
		this.name=name;
		this.topspeed=topspeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTopspeedkmph() {
		return topspeed;
	}
	public double getTopspeedmph() {
		topspeed = topspeed / 1.6;
		return topspeed;
	}
	public void setTopspeed(double topspeed) {
		this.topspeed = topspeed;
		
	}
	//public void display() {
		//System.out.println("the name is: "+name);
	//	System.out.println("the topspeed in kmph is : "+getTopspeedkmph());
		//System.out.println("the topspeed in mph is : "+getTopspeedmph());
//	}
	public static void main(String[] args) {
		CarSpeed s=new CarSpeed("BMW", 90);
	//	s.display();  
		System.out.println("the name is : "+s.getName());
		System.out.println("the name is : "+s.getTopspeedkmph());
		System.out.println("the name is : "+s.getTopspeedmph());
		s.setName("audio");
		//s.display();
	}

}






