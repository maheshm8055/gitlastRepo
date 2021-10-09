package com.pack1.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationDemo {  
		  //L10N-->LOCALIZATION
		 //I18N-->INTERNALIZATION
		 //LOCALE 
		 //RESOURCE BUNDEL -->JAVA.UTIL.*;
	 public static void main(String[] args) {  
	  
    
     
     String lang = "en";
     String country = "us";
     Locale l = new Locale(lang, country);
     ResourceBundle r = ResourceBundle.getBundle("config/Bundel.properties");
		 String str =r.getString("wish");
		  System.out.println("str");
	 }  
	}  