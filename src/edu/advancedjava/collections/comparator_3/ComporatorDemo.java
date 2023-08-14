package edu.advancedjava.collections.comparator_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	
	Collections.sort(animals);/* sorted naturally by default */
	System.out.println(animals);
	
	/*using anonymous classes to sort*/
	Collections.sort(animals, new Comparator<String>() {
	    @Override
	    public int compare(String obj1, String obj2) {
		if (obj1.length() > obj2.length()) {
		    return 1;
		} else if (obj1.length() < obj2.length()) {
		    return -1;
		} else {
		    return 0;
		}
	    }
	});
	System.out.println(animals);

	List<Integer> numbers = new ArrayList<Integer>();

	numbers.add(16);
	numbers.add(1024);
	numbers.add(64);
	numbers.add(8);
	numbers.add(2);

	Collections.sort(numbers);/* sorted naturally [directly] by default */
	System.out.println(numbers);

	/* sorted backwards by using anonymous class*/
	Collections.sort(numbers, new Comparator<Integer>() {
	    @Override
	    public int compare(Integer obj1, Integer obj2) {
		if (obj1 > obj2) {
		    return -1;
		} else if (obj1 < obj2) {
		    return 1;
		} else {
		    return 0;
		}
	    }
	});
	System.out.println(numbers);
    }
}
