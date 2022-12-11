package wildCards;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(value = { "unused" })
public class Main {

	public static void main(String[] args) {
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(new Animal(1124));
		listOfAnimals.add(new Animal(2534));
		System.out.println("Some animals' ID: ");
		printAnimals(listOfAnimals);
		
		List<Dog> listOfDogs = new ArrayList<>();
		listOfDogs.add(new Dog(124412));
		listOfDogs.add(new Dog(125523));
		System.out.println("Dogs' ID: ");
		printDogs(listOfDogs);
		
		List<Animal> listOfDogsOrAnimals = new ArrayList<>();
		listOfDogsOrAnimals.add(new Animal(124412));
		listOfDogsOrAnimals.add(new Dog(1010001));
		System.out.println("Dogs' ID or Animals' ID: ");
		printInfo(listOfDogsOrAnimals); 
	}
	
	private static void printDogs(List<Dog> list) {
		for (Dog animal : list) {
			System.out.println(animal);
		}
	}
	private static void printAnimals(List<Animal> list) {
		for (Animal animal : list) {
			System.out.println(animal);
		}
	}
	
	private static void printInfo(List<? extends Animal> list) {
		for (Animal animal : list) {
			System.out.println(animal);
		}
	}
	
	private static void printInfo_1(List<? super Doggo> list) {
		for (Object  animal : list) {
			System.out.println(animal);
		}
	}

}
