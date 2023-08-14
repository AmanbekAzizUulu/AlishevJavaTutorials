package edu.corejava.multiThreading;

public class MultiThreading implements Runnable{
	private int threadNumber;
	
	public MultiThreading(int thradNumber) {
		this.setThreadNumber(thradNumber); 
	}
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " \"Hello\" from thread " + getThreadNumber());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
	public void setThreadNumber(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	public int getThreadNumber() {
		return this.threadNumber;
	}

}
