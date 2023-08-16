package generics;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings(value = { "unused" })

public class Main {

	public static void main(String[] args) {
		/***********JAVA 5***************/
		List animals = new ArrayList();

		animals.add("cat");						//0
		animals.add("dog");						//1
		animals.add("frog");						//2


		String animal = (String) animals.get(1);
		System.out.println(animal);


		/***********С появлением GENERICS***************/
		List<String> listOfAnimals = new ArrayList<String>();
		listOfAnimals.add("doggo");
		listOfAnimals.add("kitty");
		listOfAnimals.add("froggo");

		String someAnimal = listOfAnimals.get(0);
		System.out.println(someAnimal);


		////////////////JAVA 7/////////////////////////

		List<String> animals_1 = new ArrayList<>();			//можно не указывать тип в ArrayList<>();

	}

}
