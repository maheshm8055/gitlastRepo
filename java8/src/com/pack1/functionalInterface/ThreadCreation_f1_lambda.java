package com.pack1.functionalInterface;

public class ThreadCreation_f1_lambda {
	
	public static  void main(String[] args) {
		 // lambda expression to create the object
		new Thread( ()
				->   {  System.out.println("thread is created") ;  }    ).start();
		
	  new Thread(() ->{System.out.println("create new thead "+Thread.currentThread() );  }   ).start();
	  System.out.println(Thread.activeCount());
	  System.out.println(Thread.currentThread().getThreadGroup());
		
		
	}

}
