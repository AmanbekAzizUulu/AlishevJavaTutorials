package edu.advancedjava.collections.map_introduction;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyMapDemo {

    public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<Integer, String>();		
	
	map.put(1, "one");						// adding data to the map
	map.put(3, "three");
	map.put(2, "two");
	
	System.out.println("Initial data of the map: " + map);
	
	map.put(3, "three_1");					// overwriting the data
	
	System.out.println("Data of the map after overwriting value \"three\": " + map);	
	
	System.out.println("_________________________________________________________________________");
	System.out.println("Getting value by the key: ");
	System.out.println("key: 1  ---> " + "value: " + map.get(1));
	System.out.println("key: 2  ---> " + "value: " +  map.get(2));
	System.out.println("key: 3  ---> " + "value: " +  map.get(3));
	
	System.out.println("key: 4  ---> " + "value: " +  map.get(4));		// no data for this key
	
	System.out.println("_________________________________________________________________________");
	System.out.println("Iterate over the map using for-each loop using Map.Entry's object: ");
	
	/*
	 * 	.entrySet() method returns a set of objects of type Map.Entry, 
	 * 	each representing an entry (key-value pair) in the collection
	 */
	
	for (Entry<Integer, String> entry : map.entrySet()) {
	   System.out.println("|     key: " + entry.getKey() + "   |   value: "+ entry.getValue()); 
	}
	
	/*	NOTE:
	 * 	the HashMap class does not guarantee any specific order of its elements
	 */
	
    }

}
