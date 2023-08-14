package edu.corejava.wildCards;

public class Animal {
	private int id;
	
	public Animal(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.valueOf(id);
	}
}
