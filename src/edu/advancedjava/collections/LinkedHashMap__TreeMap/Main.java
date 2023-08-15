package edu.advancedjava.collections.LinkedHashMap__TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

	Map<Integer, String> hashMap = new HashMap<>();				// the presence of order in storing elements is not guaranteed
	Map<Integer, String> linkedHashMap = new LinkedHashMap<>();		// the order of storing elements is guaranteed to be the same as the order in which those elements were added
	Map<Integer, String> treeMap = new TreeMap<>();				// the sorting of key-value pairs by key is guaranteed [natural ordering]
	
	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the HashMap collection:");
	testMap(hashMap);
	
	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the LinkedHashMap collection:");
	testMap(linkedHashMap);
	
	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the TreeMap collection:");
	testMap(treeMap);
	
	
    }
    
    private static void testMap(Map<Integer, String> mapToTest) {
	mapToTest.put(39, "John");
	mapToTest.put(25, "Eliot");
	mapToTest.put(30, "Bob");
	mapToTest.put(18, "Tim");
	mapToTest.put(50, "Mannix");
	mapToTest.put(32, "Jonnah");
	
	System.out.println("+---------------+---------------+");
	System.out.println("|     value     |      key      |");
	System.out.println("+---------------+---------------+");
	for (Map.Entry<Integer, String> entry : mapToTest.entrySet()) {
	    System.out.println("|      " + entry.getValue() + "\t|\t" + entry.getKey() + "\t|");
	}
	System.out.println("+---------------+---------------+");
    }
}
