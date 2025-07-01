package com.tnsif.Demo;

public class Student {
	private String Name;
	private int id,age;
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return this.id; 
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age; 
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return this.Name; 
	}
	@Override 
	public String toString() {
		return "Student Name: " + Name + ", id:" + id + ", age:" + age ;
	}
	
}
