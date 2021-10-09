package com.pack1.fileio;
  
import java.io.*;
import java.util.Scanner;  
/**
 * text from console using streem reader
 *
 */
public class BufferedReaderExample{    
     public  static void inputTConsolScanner() {
    	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter your name");
    	 String s = sc.next();  //Parsing int
    	 System.out.println(s);
		
	}
     
     public static void readstopuntil() throws IOException {
    	 InputStreamReader sr = new InputStreamReader(System.in);
    			 BufferedReader brd = new BufferedReader(sr);
    			 String  word ="";
    			 while(!word .equals("stop")) 
    			 {
    				 System.out.println("write on console data ");
    				 word = brd.readLine();
    				 System.out.println(word);
    				 
    				 
    			 }	   			 
     }
	
	
	public static void main(String args[])throws Exception{             
		/*
		 * InputStreamReader r=new InputStreamReader(System.in); BufferedReader br=new
		 * BufferedReader(r); System.out.println("Enter your name"); String
		 * name=br.readLine(); System.out.println("Welcome "+name);
		 * BufferedReaderExample.inputTConsolScanner();
		 */
    BufferedReaderExample.readstopuntil();
}    
}  