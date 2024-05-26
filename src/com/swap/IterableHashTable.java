package com.swap;

import java.util.Enumeration;
import java.util.Hashtable;

public class IterableHashTable {
       public static void main(String[]args) {
    	   
    	   //Creating hashtable..
    	   Hashtable hashtable=new Hashtable();
    	   
    	   //putting elements in hashtable..
    	   hashtable.put("1", "Monday");
    	   hashtable.put("2", "Tuesday");
    	   hashtable.put("3","Wednesday");
    	  //Enumeration Object..
    	   Enumeration enumeration_hashtable=hashtable.elements();
    	   
    	   //while loop runs until elements in hashtable exists..
    	   while(enumeration_hashtable.hasMoreElements()) {
    		   System.out.println(enumeration_hashtable.nextElement());
    	   }
    	   
       }
}
