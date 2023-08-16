package collections.comparator_4;

public class Person {
    private int id;
    private String name;
    
    private Person() {
    }
    
    public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
    }
    
    
    @Override
    public String toString() {
	return "\nPerson [id = " + id + ", name = " + name + "]\n";
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
    
}
