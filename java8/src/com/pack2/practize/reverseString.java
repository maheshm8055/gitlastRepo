package com.pack2.practize;

import java.util.Scanner;

public class reverseString 
{
	String  orginal = "";
	
	public void reversCharAt()
	{
		int length = orginal.length();
		for(int i = length-1 ; i>=0; i-- ) {
			
			char reversOut = orginal.charAt(i);
			System.out.print(reversOut);
		}
	}
	
	public void charArray()
	{  char[] ch = orginal.toCharArray();
	   int len = ch.length;
	  	  
	   StringBuffer sb = new StringBuffer();
	   for (int i = 0; i < len; i++) {
		   
           // Print current character
           System.out.print(ch[i] + " ");
       }
      	System.out.println("++++++++++++++++");
	}

	 public void splitChar()
	 {
		 String[] substring =orginal.split("");
		 for(String s : substring) 
		 {
			 System.out.println(s);
		 }
		 
	 }
	public static void main(String[] args) {
		reverseString  r = new reverseString();
		Scanner sc = new Scanner(System.in);
		r.orginal = sc.next(); 
		
		StringBuilder sb = new StringBuilder(r.orginal);
		System.out.println(sb.reverse());
		r.reversCharAt();
		r.charArray();
		System.out.println("+++++++++++++");
		r.splitChar();
	}
}
