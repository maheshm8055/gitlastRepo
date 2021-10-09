package com.pack1.functionalInterface;

public class ThreadCreation_f1 {

	public static void main(String[] args) {
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			System.out.println("narmal thread created by overiding run methode anonymouse classusing "+Thread.currentThread().getName());
			
		}
	}).start();
	

	}
}
