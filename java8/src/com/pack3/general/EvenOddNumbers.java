package com.pack3.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class EvenOddNumbers {
	static int stratingNumber = 10;
	static int endingNumber = 20;
	private long primeNumUpTo = 85;

	List<Integer> even = new ArrayList<Integer>();
	List<Integer> Odd = new ArrayList<Integer>();

	public void evenAndOddNumberList() {

		for (int i = stratingNumber; i <= endingNumber; i++) {

			if (i % 2 == 0) {
				even.add(i);
			} else {
				Odd.add(i);
			}

		}
		System.out.println(even);
		System.out.println(Odd);

		Iterator<Integer> iterator = Odd.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println("lanbda expressions");
		// forEach method of ArrayList and
		// print numbers
		even.forEach((n) -> System.out.print(n + "  "));
		Odd.forEach((k) -> System.out.println(k));
		even.forEach((n) -> System.out.println(n));

	}

	public void primeNumbers() {
		// List primeList = new ArrayList();
		System.out.println("prime numbers  up to given  number is   ");
		for (int i = 1; i <= primeNumUpTo; i++) {
			int flage = 1;
			for (int j = 2; j <= (i * 0.5); j++) {
				if ((i % j == 0)) {
					flage = 0;
					break;

				}
			}
			if (flage == 1) {

				System.out.print("   " + i);

			}
		}
	}

	public void givenNumberIsprimEvenOdd(int givenNum) 
	{
		int givenNum1  = givenNum; 
		
		
		if (givenNum1 *0.5 == 0) {
			System.out.println("it is not a prime"+givenNum1);
			
		}
		
		if(givenNum1 == 1 ||givenNum1 == 2  ) {
			
			System.out.println("it is  a prime"+givenNum1);
			
		}
		
		else {
			System.out.println("it is  a prime"+givenNum1);
		}
		
		if (givenNum1 % 2= )
		
		
	}
	public static void main(String[] args) {
		/*
		 * Scanner sc1 = new Scanner( System.in); stratingNumber = sc1.nextInt();
		 * Scanner sc2 = new Scanner( System.in); endingNumber = sc2.nextInt();
		 * System.out.println("entered numbers are "+stratingNumber+"  \t"+endingNumber)
		 * ;
		 */
		EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
		evenOddNumbers.evenAndOddNumberList();
		evenOddNumbers.primeNumbers();
	}

}
