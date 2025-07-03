package com.tnsif.Polymorphism;

public class Person {
	private int pid;
	private String name;
	private String city;
	
	public Person()//default constructor
	{
		this.pid=100;
		this.name="arun";
		this.city="chennai";
	}
	public Person(int pid,String name)
	//only 2 parameters
	{
		this.pid=pid;
		this.name=name;
		this.city="Puducherry";
	}
	public Person(int pid,String name,String city)
	//only 3 parameters
	{
		this.pid=pid;
		this.name=name;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
	}
	
}

