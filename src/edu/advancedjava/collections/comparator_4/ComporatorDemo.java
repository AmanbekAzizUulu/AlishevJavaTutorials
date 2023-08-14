package edu.advancedjava.collections.comparator_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComporatorDemo {
    public static void main(String[] args) {
	List<Person> people = new ArrayList<Person>();

	people.add(new Person(123, "Aibek"));
	people.add(new Person(132, "Eleonora"));
	people.add(new Person(321, "Mike"));
	people.add(new Person(231, "John"));

	Collections.sort(people, new Comparator<Person>() {
	    @Override
	    public int compare(Person o1, Person o2) {
		if (o1.getId() > o2.getId()) {
		    return 1;
		} else if (o1.getId() < o2.getId()) {
		    return -1;
		} else {
		    return 0;
		}
	    }
	});
	System.out.println(people);
    }
}
