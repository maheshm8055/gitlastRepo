package com.pack1.locale;

import java.util.Locale;

public class LocaleMethodExample {
 
    public static void main(String[] args) {
         
        // Getting a default locale object
        Locale locale = Locale.getDefault();
        System.out.println("Default Locale: "+locale.getCountry());
         
        // Getting all available locales from current instance of the JVM
		/*
		 * Locale []availableLocale = Locale.getAvailableLocales(); for(Locale aLocale :
		 * availableLocale){
		 * System.out.println("Name of Locale: "+aLocale.getDisplayName());
		 * System.out.println("Language Code: "+aLocale.getLanguage()
		 * +", Language Display Name: "+aLocale.getDisplayLanguage());
		 * System.out.println("Country Code: "+aLocale.getCountry()
		 * +", Country Display Name: "+aLocale.getDisplayCountry());
		 * if(!aLocale.getScript().equals("")){
		 * System.out.println("Script Code: "+aLocale.getScript()
		 * +", Script Display Name: "+aLocale.getDisplayScript()); }
		 * if(!aLocale.getVariant().equals("")){
		 * System.out.println("Variant Code: "+aLocale.getVariant()
		 * +", Variant Display Name: "+aLocale.getDisplayVariant()); }
		 * System.out.println(
		 * "****************************************************************"); }
		 */
    }
 
}
