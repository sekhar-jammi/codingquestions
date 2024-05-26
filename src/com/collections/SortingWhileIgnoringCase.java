package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWhileIgnoringCase {
       public static void main(String[]args) {
    	      ArrayList<String> list=new ArrayList<>();
    	      list.add("zeba");
    	      list.add("ashwin");
    	      list.add("Bhargav");
    	      list.add("chetan");
    	      
    	      System.out.println("list before sorting:..");
    	      System.out.println(list);
    	      
    	      Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
    	      
    	      System.out.println("list after sorting:");
    	      System.out.println(list);
       }
}
