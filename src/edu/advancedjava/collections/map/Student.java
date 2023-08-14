package edu.advancedjava.collections.map;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private int studentId;
   
    public Student(String name, int id, int studentId) {
	super();
	this.name = name;
	this.id = id;
	this.studentId = studentId;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id, name, studentId);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Student other = (Student) obj;
	return id == other.id && Objects.equals(name, other.name) && studentId == other.studentId;
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
	return "Student [name=" + name + ", id=" + id + ", studentId=" + studentId + "]";
    }
    
    
}
