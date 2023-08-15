package edu.advancedjava.equals_hashCode__methods.afterOverriding;

import java.util.Objects;

public class Person {
    private String name;
    private int id;
    
    @SuppressWarnings(value = "unused")
    private Person() {
    }
    
    public Person(String name, int id) {
	this.name = name;
	this.id = id;
    }

    
    @Override
    public int hashCode() {
	return Objects.hash(id, name);
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
	return "Person [name=" + name + ", id=" + id + "]";
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    /*
     *	Contract between the equals() and hashCode() methods
     *	
     *	When comparing two objects for equality, the hashCode() method is invoked on each object.
     * 		If object_1.hashCode() != object_2.hashCode(), then these objects are truly not equal to each other [there is no need to call the equals() method].
     *		If object_1.hashCode() == object_2.hashCode(), then two assumptions can be made:
     *				-> object_1 and object_2 are indeed equal to each other;
     *				-> object_1 and object_2 are actually distinct from each other, and a collision occurred when invoking the hashCode() method on one of these objects.
     *	
     *	In both cases, the boolean equals(Object object) method is called on one of the objects.
     *	The  object_1.equals(object_2) method returns a true value if the two objects are considered equal.
     * 
     */
    
}
