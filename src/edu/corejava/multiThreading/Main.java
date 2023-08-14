package edu.corejava.multiThreading;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			MultiThreading multiThreader = new MultiThreading(i);
			Thread myThread = new Thread(multiThreader);
			
			myThread.start();
		}
		
	}

}
