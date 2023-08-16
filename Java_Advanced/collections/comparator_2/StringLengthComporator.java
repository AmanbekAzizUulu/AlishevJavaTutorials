package collections.comparator_2;

import java.util.Comparator;

public class StringLengthComporator implements Comparator<String> {
    
    /*
     * by the Java convention:
     * 
     * if 	object1 > object2 => returns 1;
     * else if  object1 < object2 => returns -1;
     * else 	object1 == object2 => returns 0;
     *
     */
    
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

}
