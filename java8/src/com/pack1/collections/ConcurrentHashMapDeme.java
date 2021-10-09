package com.pack1.collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDeme {
	 
    public static void main(String[] args)
    {
        // create an instance of
        // ConcurrentHashMap
        ConcurrentHashMap<Integer, String> m
            = new ConcurrentHashMap<>();
        System.out.println(Thread.currentThread().activeCount());
        
        System.out.println( "++++++++++++++++++");
        // Insert mappings using
        // put method
        m.put(100, "Hello");
        m.put(101, "Geeks");
        m.put(102, "Geeks");
        m.put(105, "+++++++++++++++++++++++");
 
        // Here we cant add Hello because 101 key
        // is already present in ConcurrentHashMap object
        m.putIfAbsent(101, "Hello");
 
        // We can remove entry because 101 key
        // is associated with For value
        m.remove(101, "Geeks");
 
        // Now we can add Hello
        m.putIfAbsent(103, "Hello");
 
        // We cant replace Hello with For
        m.replace(101, "Hello", "For");
        System.out.println(m);
        System.out.println(m);
       System.out.println("+++++++++++++++++" +Thread.activeCount());
       
        
    }
}