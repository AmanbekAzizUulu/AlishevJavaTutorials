package collections.comparator_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComporatorDemo {
    public static void main(String[] args) {
	List<String> animals = new ArrayList<String>();

	animals.add("puppy");
	animals.add("piglet");
	animals.add("calf");
	animals.add("frog");
	animals.add("ox");
	animals.add("kitten");

	Collections.sort(animals, new StringLengthComporator());
	System.out.println(animals);

	List<Integer> numbers = new ArrayList<Integer>();

	numbers.add(16);
	numbers.add(1024);
	numbers.add(64);
	numbers.add(8);
	numbers.add(2);
	
	Collections.sort(numbers);						// sorted directly by default
	System.out.println(numbers);
	
	Collections.sort(numbers, new BackwardsIntegerComporator());	// sorted backwards
	System.out.println(numbers);
    }
}
