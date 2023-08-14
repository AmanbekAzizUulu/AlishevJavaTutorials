package edu.advancedjava.collections.linkedlist;

import java.util.Arrays;

public class MyLinkedList{
    private Node head;
    private int size;

    public void add(int value) {
	if (head == null) {
	    this.head = new Node(value);
	} else {
	    Node tempNode = head;

	    while (tempNode.getNext() != null) {
		tempNode = tempNode.getNext();
	    }
	    tempNode.setNext(new Node(value));
	}
	size++;
    }

    public int get(int index) {
	int currentIndex = 0;
	Node temp = head;

	while (temp != null) {
	    if (currentIndex == index) {
		return temp.getValue();
	    } else {
		temp = temp.getNext();
		currentIndex++;
	    }
	}
	throw new IllegalArgumentException();
    }

    public void remove(int index) {
	if (index == 0) {
	    head = head.getNext();
	    size--;
	    return;
	}
	
	int currentIndex = 0;
	Node temp = head;

	while (temp != null) {

	    if (currentIndex == index - 1) {
		temp.setNext(temp.getNext().getNext());
		size--;
		return;
	    } else {
		temp = temp.getNext();
		currentIndex++;
	    }
	}
    }

    @Override
    public String toString() {

	int[] result = new int[size];

	int index = 0;
	Node tempN = head;

	while (tempN != null) {
	    result[index++] = tempN.getValue();
	    tempN = tempN.getNext();
	}

	return Arrays.toString(result);
    }

    public Node getHead() {
	return head;
    }

    public void setHead(Node head) {
	this.head = head;
    }

    public int getSize() {
	return size;
    }

    public void setSize(int size) {
	this.size = size;
    }

    private static class Node {
	private Node next;
	private int value;

	public Node(int value) {
	    this.setValue(value);
	}

	public Node getNext() {
	    return next;
	}

	public void setNext(Node next) {
	    this.next = next;
	}

	public int getValue() {
	    return value;
	}

	public void setValue(int value) {
	    this.value = value;
	}
    }


}
