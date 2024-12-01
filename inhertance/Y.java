package com.inhertance;

public class Y  extends X{

	@Override
	public void sms() {
		super.sms();
	}
	public static void main(String[] args) {
		Y y=new Y();
		y.sms();
	}
}
