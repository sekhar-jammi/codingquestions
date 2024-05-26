package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingWithoutCases {
       public static void main(String[]args) {
    	      ArrayList<String> list=new ArrayList<>();
    	      list.add("sekhar");
    	      list.add("Bhargav");
    	      list.add("ashwin");
    	      list.add("sekhar");
    	      
    	      System.out.println("list before sorting..");
    	      System.out.println(list);
    	      
    	      Collections.sort(list);
    	      
    	      System.out.println("list after sorting:..");
    	      System.out.println(list);
       }
}
