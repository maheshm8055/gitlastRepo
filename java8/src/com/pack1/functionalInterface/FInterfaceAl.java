package com.pack1.functionalInterface;

@FunctionalInterface
public interface FInterfaceAl {

	public void squar(int n);

	public static void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum of two numbers" + sum);
	}

	default void subtract(int num1, int num2) {
		int differ = 0 ;
		if (num1 > num2) {

			differ = num1 - num2;
		} else if (num1 < num2) {
			differ = num2 - num1;
		}
		System.out.println(differ);
	}

}
