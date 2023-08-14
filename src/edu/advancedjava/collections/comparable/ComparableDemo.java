package edu.advancedjava.collections.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableDemo {
    public static void main(String[] args) {
	List<Person> listPeople = new ArrayList<Person>();
	Set<Person> setPeople = new TreeSet<Person>();
	
	addElements(listPeople);
	addElements(setPeople);
	
	System.out.println("Before Collections.sort() method invocation on list of pepole:");
	System.out.println(listPeople);
	System.out.println(setPeople);
	
	Collections.sort(listPeople);
	
	System.out.println("\nAfter Collections.sort() method invocation on list of pepole:");
	System.out.println(listPeople);
	System.out.println(setPeople);
    }
    
    private static void addElements(Collection<Person> collection) {
	collection.add(new Person(213, "Temirlan"));
	collection.add(new Person(312, "Le"));
	collection.add(new Person(231, "Mikey"));
	collection.add(new Person(321, "John"));
	collection.add(new Person(132, "Eleonora"));
	collection.add(new Person(123, "Abu"));
    }
}
