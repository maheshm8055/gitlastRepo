package com.pack1.functionalInterface;

public abstract class FInterfaceAlTest implements FInterfaceAl {
	public static void main(String[] args) {
		
		FInterfaceAl i = (n) ->System.out.println("square of the number"+n*n);
	   i.squar(10);
	   i.subtract(20, 30);
	   FInterfaceAl.add(20, 1000);
	
	
	}
	

}
