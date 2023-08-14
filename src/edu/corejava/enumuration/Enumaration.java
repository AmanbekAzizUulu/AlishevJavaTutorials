package edu.corejava.enumuration;

public class Enumaration {
    public static void main(String[] args) {
	Animal animal = Animal.CAT;

	switch (animal) {
	case CAT: {
	    System.out.println("It's a cat!");
	    break;
	}
	case DOG: {
	    System.out.println("It's a dog!");
	    break;
	}
	case TIGER: {
	    System.out.println("It's a tiger!");
	    break;
	}
	case FROG: {
	    System.out.println("It's a frog!");
	    break;
	}
	default:
	    System.out.println("It is not an animal!");
	}
    }
}
