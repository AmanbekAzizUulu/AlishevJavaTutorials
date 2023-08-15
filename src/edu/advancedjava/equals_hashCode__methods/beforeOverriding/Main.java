package edu.advancedjava.equals_hashCode__methods.beforeOverriding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	Map<Person, String> personsMap = new HashMap<>();
	Set<Person> personsSet = new HashSet<>();
	
	System.out.println("Content of the Set and Map collections before overriding the equals() and hashCode() methods\n");
	Person person_1 = new Person("Aibek", 10001);
	Person person_2 = new Person("Aibek", 10001);
	
	personsMap.put(person_1, "123");
	personsMap.put(person_2, "123");
	
	personsSet.add(person_1);
	personsSet.add(person_2);
	
	printer_set(personsSet);
	printer_map(personsMap);
    }

    public static <T>void printer_set(Set<T> personsSet) {
	System.out.println("Elements of set: ");
	personsSet.forEach(element -> System.out.println(element));
	System.out.println();
    }

    public static <K, V> void printer_map(Map<K, V> map) {
	System.out.println("Elements of map: ");
	System.out.println("+---------------+---------------------------------------+");
	System.out.println("|     value     |		       key		|");
	System.out.println("+---------------+---------------------------------------+");
	for (Entry<K, V> entry : map.entrySet()) {
	    System.out.println("|      " + entry.getValue() + "\t|\t" + entry.getKey() + "\t|");
	}
	System.out.println("+---------------+---------------------------------------+");
    }

}
