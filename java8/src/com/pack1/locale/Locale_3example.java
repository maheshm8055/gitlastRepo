package com.pack1.locale;

import java.util.Locale;

public class Locale_3example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale l1 =  Locale.getDefault();
		System.out.println(l1.getCountry()+" \t "+l1.getDisplayCountry()+"\t"+l1.getDisplayLanguage()+"\t"+l1.getDisplayVariant()+l1.getDisplayScript(l1));
	
          Locale l2 = new Locale("pa","IN"); 	
          System.out.println(l2.getDisplayCountry()+l2.getDisplayScript(l2));
          
          
          
	     
	
	}

}
