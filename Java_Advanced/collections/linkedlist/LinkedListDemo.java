package collections.linkedlist;

public class LinkedListDemo {
    public static void main(String[] args) {
	MyLinkedList list = new MyLinkedList();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
	System.out.println("Содержимое связного списка: "+ list.toString());
	
	System.out.println("Получение значения связного списка по индексу 3: " + list.get(3));
	
	System.out.println("Удаление элемента связного списка под индексом 0 ...");
	list.remove(0);
	
	System.out.println("Содержимое связного списка после удаления: " + list.toString());
	
	// < https://youtu.be/LG-q2VBUSCw > how to implement iterable 
	
    }
}
