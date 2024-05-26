package com.collections;

import java.util.ArrayList;

public class ConvertArrayListToArray {
       public static void main(String[]args) {
    	      ArrayList<String> list=new ArrayList<>();
    	      
    	      
    	      list.add("java");
    	      list.add("python");
    	      list.add("html");
    	      list.add("css");
    	      
    	      String[] array=new String[list.size()];
    	      list.toArray(array);
    	      System.out.println(array);
    	      for(String string:array) {
    	    	  System.out.println(string);
    	      }
    	      
       }
}
