package collections.comparable;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private int id;
    private String name;

    @SuppressWarnings("unused")
    private Person() {
    }

    public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }

    @Override
    public int hashCode() {
	int result = id;
	result = 31 * result + (name != null ? name.hashCode() : 0);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Person other = (Person) obj;
	return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
	return "Person { id=" + id + ", name=" + name + " }";
    }

    @Override
    public int compareTo(Person personToCompare) {
	
	/*Sorting by ID*/
//	if (this.getId() > personToCompare.getId()) {
//	    return 1;
//	} else if (this.getId() < personToCompare.getId()) {
//	    return -1;
//	} else {
//	    return 0;
//	}
	
	/*Sorting by name's length*/
	if (this.getName().length() > personToCompare.getName().length()) {
	    return 1;
	} else if (this.getName().length() < personToCompare.getName().length()) {
	    return -1;
	} else {
	    return 0;
	}
	
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}
