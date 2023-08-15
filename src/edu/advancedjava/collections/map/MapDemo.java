package edu.advancedjava.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
	Map<Double, Student> studentsMap = new HashMap<>();
	
	studentsMap.put( 7.3,new Student("Aibek", 16465, 123));
	studentsMap.put( 7.2,new Student("Eleonora", 56413, 321));
	studentsMap.put(7.5,new Student("Thomyris", 63413, 421) );
	
	for (Entry<Double, Student> entry : studentsMap.entrySet()) {
	    System.out.println("KEY: " + entry.getKey() + "---> VALUE: " + entry.getValue());
	}
	
	System.out.println("\nSelection by key:");
	System.out.println(studentsMap.get(7.3));
	System.out.println(studentsMap.get(7.5));
	System.out.println(studentsMap.get(7.0));
	
    }
    
}
