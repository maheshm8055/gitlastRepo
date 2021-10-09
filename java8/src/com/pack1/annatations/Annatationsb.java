package com.pack1.annatations;

import java.util.ArrayList;

public class Annatationsb extends AnnatationsA{
	int x=  200 ; 

	
    @MyAnnjotationCustom
	@Override
	public void show() {
	  
	  System.out.println("Annatationsb");
	  
	  }
	 
	public static void main(String[] args) {
	
		AnnatationsA a = new Annatationsb();
		a.show();
		System.out.println(a .x);
		a.old();
		@SuppressWarnings(value = { "" })
		ArrayList al = new ArrayList();
	}

}
