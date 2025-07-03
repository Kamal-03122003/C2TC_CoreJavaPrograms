package com.tnsif.Polymorphism;

public class Executor {

	public static void main(String[] args) {
		System.out.println("1.Addition:"+OverloadingExample.addition("Hello", " World"));
		System.out.println("2.Addition:"+OverloadingExample.addition(12, 100));
		System.out.println("3.Addition:"+OverloadingExample.addition(10, 4.67f));
		System.out.println("4.Addition:"+OverloadingExample.addition(35.8f, 156));
		System.out.println("5.Addition:"+OverloadingExample.addition(89.7f, 56.3f));
		
	
		Person p1=new Person();//default constructor
		System.out.println(p1);
		
		p1=new Person(101,"hema");//2 parameter constructor
		System.out.println(p1);
		
		p1=new Person(102,"esther","bangalore");
		//3 parameter constructor
		System.out.println(p1);
	}
}

