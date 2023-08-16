package equals_hashCode__methods.beforeOverriding;


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
    
    
}
