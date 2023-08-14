package edu.advancedjava.collections.comparator_2;

import java.util.Comparator;

public class BackwardsIntegerComporator implements Comparator<Integer> {

    /*
     * by the Java convention:
     * 
     * if 	object1 > object2 => returns 1;
     * else if  object1 < object2 => returns -1;
     * else	object1 == object2 => returns 0;
     *
     */
    
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

}
