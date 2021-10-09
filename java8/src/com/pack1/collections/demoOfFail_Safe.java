package com.pack1.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class demoOfFail_Safe {
	
	    public static void main(String[] args) 
	    {
	        ArrayList l = new ArrayList();
	        l.add("A");
	        l.add("B");
	        l.add("C");
	        Iterator itr = l.iterator();
	          l.remove(2);
	        while (itr.hasNext()) 
	        {
	            String s = (String)itr.next();
	              
	            if (s.equals("B"))
	            {
	                // Can remove
	                itr.remove();
	            }
	        }
	        
	        System.out.println(l);
	    }
}