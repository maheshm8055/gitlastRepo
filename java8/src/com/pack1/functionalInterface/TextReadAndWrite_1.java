package com.pack1.functionalInterface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TextReadAndWrite_1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fin = new FileReader("C:\\Users\\Dell\\Desktop\\Source\\source.txt"); 
		 Scanner finReader = new Scanner(fin);
          while(finReader.hasNext()) 
          {
        	  String line = finReader.next();
        	  System.out.println(line);
          }
	}

}
