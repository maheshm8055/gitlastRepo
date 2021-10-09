package com.pack1.functionalInterface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Java8FileReader {
	public static void main(String args[]) throws IOException { 
		// reading a file line by line before Java 8 
		/*
		 * FileReader fr = new
		 * FileReader("C:\\Users\\Dell\\Desktop\\Source\\source.txt"); BufferedReader
		 * bufr = new BufferedReader(fr); int count = 1; String line = bufr.readLine();
		 * System.out.println("Old way of reading file line by line in Java : "); while
		 * (line != null) { System.out.println(count + " : " + line); line =
		 * bufr.readLine(); count++; } bufr.close();
		 */ 
		// reading file line by line in Java 8 
		t maxCnt = wordFrequency.values().stream().max(Comparator.naturalOrder()).get();
		 System.out.println("Reading file line by line using Files.lines() in Java 8");
						Files.lines(Paths.get("C:\\Users\\Dell\\Desktop\\Source\\source.txt")).forEach(System.out::); // You
						// can do even better, you can read all lines // trim them and filter out all
						// empty lines // before printing as shown in following example
						
						  System.out. println("Doing more things than just reading file using Java 8 Streams");
						  Files.lines(new File("C:\\Users\\Dell\\Desktop\\Source\\source.txt").toPath()).map(s -> s.trim()) .filter(s ->
						  !s.isEmpty()) .forEach(System.out::println);
						 
						// You can also
						// filter line using String methods
						// e.g. print only lines which starts with "
						//System.out.println("Printing lines which startswith );
						//Files.lines(Paths.get("build.xml")) .map(s -> s.trim()).filter(s ->s.startsWith("/")).forEach(System.out::println); } }
	}
}

