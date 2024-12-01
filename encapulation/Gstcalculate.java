package com.encapulation;

public class Gstcalculate {
	String productname;
	double price;
	double gst;
	public Gstcalculate() {
	
	}
	public Gstcalculate(String productname, double price, double gst) {
		super();
		this.productname = productname;
		this.price = price;
		this.gst = gst;
	}
	public double calculategst() {
		return ((price * gst)/100);
	}
	public double Totalamount() {
		return price+calculategst();
	}
	public void disply() {
		System.out.println(productname+" "+price+" "+gst);
	}
	public static void main(String[] args) {
		Gstcalculate gstcalculate=new Gstcalculate("tv", 890.00, 90.00);
		gstcalculate.disply();
		System.out.println(gstcalculate.calculategst());
		System.out.println(gstcalculate.Totalamount());
		
	}

}
