package com.tnsif.Polymorphism.overriding;

public class Rectangle {
	private double l,b;
	public Rectangle(double l,double b) {
		this.l=l;
		this.b=b;
	}
	@Override
	public void callArea() {
		System.out.println("From Rectangle Class : "+ (l*b));
	}
}
