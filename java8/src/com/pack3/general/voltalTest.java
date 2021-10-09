package com.pack3.general;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class voltalTest {
	volatile int a = 20;
	public volatile int[] array = new int[3];
	volatile List l1 = new CopyOnWriteArrayList();
	volatile Map m1 = new ConcurrentHashMap();
	BigDecimal amount3 = new BigDecimal("2.15"); // using for scientific calculations
	static BigDecimal amount4 = new BigDecimal("1.10");
	double amount1 = 2.15;
	double amount2 = 1.10;

	public static void main(String[] args) {
		voltalTest ob = new voltalTest();
		System.out.println(ob.amount1 - ob.amount2);
		System.out.println(ob.amount3.subtract(amount4));
	}

}
