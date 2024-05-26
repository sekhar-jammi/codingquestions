package com.swap;

import java.util.HashMap;

public class CollectionViewOfHashMap {
       public static void main(String[]args) {
    	      HashMap<String,String> hashmap=new HashMap<String,String>();
    	      hashmap.put("1", "monday");
    	      hashmap.put("2", "tuesday");
    	      hashmap.put("3", "wednesday");
    	      
    	      System.out.println("orirginal hashmap:"+hashmap);
    	      
    	      //collection view of hashmap..
    	      
    	      System.out.println("collection view of hashmap:"+hashmap.values());
       }
}
