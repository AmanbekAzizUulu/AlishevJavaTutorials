package edu.corejava.wrapperClasses;

public class Main {

    public static void main(String[] args) {
	int someInteger = 1;
	System.out.println(someInteger);

	Integer integer = new Integer(someInteger);
	Integer.parseInt("123");
	System.out.println(integer.byteValue());

	Integer integer_1 = 123; 					// автоупаковка
	Integer integer_2 = new Integer(123);
	int someInteger_1 = integer_2; 					// распаковка
    }

}
