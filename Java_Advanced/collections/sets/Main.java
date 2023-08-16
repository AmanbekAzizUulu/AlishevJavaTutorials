package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    private static final String SEARCHED_ELEMENT = "Mike";

    public static void main(String[] args) {

	Set<String> hashSet = new HashSet<>(); // the presence of order in storing elements is not guaranteed
	Set<String> linkedHashSet = new LinkedHashSet<>(); // the order of storing elements is guaranteed to be the same
							   // as the order in which those elements were added
	Set<String> treeSet = new TreeSet<>(); // the sorting of elements pairs by default is guaranteed [natural
					       // ordering]

	elementAdder__String(hashSet);
	elementAdder__String(treeSet);
	elementAdder__String(linkedHashSet);

	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the HashSet collection:");
	printer(hashSet);

	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the TreeSet collection:");
	printer(treeSet);

	System.out.println("____________________________________________________________________");
	System.out.println("Output of elements added to the LinkedHashSet collection:");
	printer(linkedHashSet);

	/*
	 * methods of Set interface
	 */

	System.out.println("____________________________________________________________________");
	System.out.println("Usage of the .forEachRemaining(Consumer<? super T> action) method: ");

	hashSet.forEach(element -> {
	    if (element.equals(SEARCHED_ELEMENT)) {
		System.out.println("\t" + SEARCHED_ELEMENT + " is in the given Hash Set");
	    }
	});
	linkedHashSet.forEach(element -> {
	    if (element.equals(SEARCHED_ELEMENT)) {
		System.out.println("\t" + SEARCHED_ELEMENT + " is in the given Linked Hash Set");
	    }
	});
	treeSet.forEach(element -> {
	    if (element.equals(SEARCHED_ELEMENT)) {
		System.out.println("\t" + SEARCHED_ELEMENT + " is in the given Tree Set");
	    }
	});

	System.out.println("____________________________________________________________________");
	System.out.println("Usage of the .contains(Object element) method: ");
	System.out.println("\tgiven HashSet is contains searched element: " + hashSet.contains(SEARCHED_ELEMENT));
	System.out.println("\tgiven TreeSet is contains searched element: " + treeSet.contains(SEARCHED_ELEMENT));
	System.out.println("\tgiven LinkedHashSet is contains searched element: " + linkedHashSet.contains(SEARCHED_ELEMENT));
	
	System.out.println("____________________________________________________________________");
	System.out.println("Usage of the .isEmpty(); method: ");
	System.out.println("\tgiven HashSet is empty: " + hashSet.isEmpty());
	System.out.println("\tgiven TreeSet is empty: " + treeSet.isEmpty());
	System.out.println("\tgiven LinkedHashSet empty: " + linkedHashSet.isEmpty());

	

	Set<Integer> set_A = new HashSet<>();
	Set<Integer> set_B = new HashSet<>();
	
	elementAdder__Integer(set_A);
	elementAdder__Integer(set_B);
	
	System.out.println("____________________________________________________________________");
	System.out.println("Contents of sets A and B: ");
	System.out.println("A :\n");
	set_A.forEach( element -> System.out.print("\t" + element));
	System.out.println("\nB :\n");
	set_B.forEach(element -> System.out.print("\t" + element));
	
	/*
	 *		Set union operation 
	 */
	
	Set<Integer> set_Union = new HashSet<>(set_A);				// creates a HashSet containing the elements of the specified collection
	
	set_Union.addAll(set_B);
	System.out.println("\n\nContent of the set obtained by uniting set A and set B:\n");
	
	set_Union.forEach(element -> System.out.print("\t" + element));
	
	/*
	 *		Set intersection operation
	 */
	
	Set<Integer> set_Intersection = new HashSet<>(set_A); 			// creates a HashSet containing the elements of the specified collection
	
	/*
	 *	 this method is used to retain only the elements that are present in the current collection (set or list) and another collection that is provided as an argument
	 *	 it modifies the current collection by removing elements that are not present in the specified collection
	 */
	
	set_Intersection.retainAll(set_B);
	System.out.println("\n\nContent of the set obtained by intersecting set A with set B:\n");
	set_Intersection.forEach(element -> System.out.print("\t" + element));
	
	/*
	 *		Set difference operation
	 */
	
	Set<Integer> set_Difference = new HashSet<>(set_A); 			// creates a HashSet containing the elements of the specified collection
	
	/*
	 *	 this method is used to remove all elements from the current collection (set or list) that are also present in another collection provided as an argument
	 *	 it modifies the current collection by removing elements that are common with the specified collection.	 
	 */
	
	set_Difference.removeAll(set_B);
	System.out.println("\n\nContent of the set obtained by subtracting elements of set B from elements of set A:\n");
	set_Difference.forEach(element -> System.out.print("\t" + element  ));
	
    }

    public static void elementAdder__String(Set<String> set) {
	set.add("Mike");
	set.add("Judy");
	set.add("John");
	set.add("Ellieh");
	set.add("Micky");
	set.add("Micky");			// duplicate 
    }
    public static void elementAdder__Integer(Set<Integer> set) {
	for (int i = 0; i < 5; i++) {
	    set.add(new Random().nextInt(10));
	}
    }
    public static void printer(Set<String> set){
	for (String e : set) {
	    System.out.println(e);
	}
    }
}
