package edu.corejava.interfaces;

public class Person implements Info{
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("--== Hello there!!! ==--");
	}
	
	@Override
	public void showInfo() {
		System.out.println("My Name is: " + this.name);
	}
}
