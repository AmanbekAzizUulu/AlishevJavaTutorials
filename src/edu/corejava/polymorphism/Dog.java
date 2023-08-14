package edu.corejava.polymorphism;

public class Dog extends Animal{
	public void doBark() {
		System.out.println("Woof! Woof!");
	}
	
	@Override
	public void doEat() {
		System.out.println("The Doggo is eating)");
	}
}
