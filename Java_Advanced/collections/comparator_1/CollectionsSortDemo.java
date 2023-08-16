package collections.comparator_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortDemo {
    public static void main(String[] args) {
	List<String> animals = new ArrayList<String>();
	
	animals.add("puppy");
	animals.add("piglet");
	animals.add("calf");
	animals.add("frog");
	animals.add("ox");
	animals.add("kitten");
	System.out.println("Порядок элементов в неотсортированной коллекции строковых данных: " + "\n" +animals);
	/*
	 * 	by default in Java strings are sorted lexicographically - natural order
	 */
	
	Collections.sort(animals);
	System.out.println("Порядок элементов в отсортированной коллекции строковых данных: " + "\n" +animals);
	
	System.out.println();
	List<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(16);
	numbers.add(1024);
	numbers.add(64);
	numbers.add(8);
	numbers.add(2);
	System.out.println("Порядок элементов в неотсортированной коллекции целочисленных данных: " + "\n" + numbers);
	Collections.sort(numbers);
	System.out.println("Порядок элементов в отсортированной коллекции целочисленных данных: " + "\n" + numbers);
	
    }
}
