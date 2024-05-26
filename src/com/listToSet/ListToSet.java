package com.listToSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
       public static void main(String[]args) {
    	      //create list..
    	      List<String> list=new ArrayList<>();
    	      list.add("apple");
    	      list.add("orange");
    	      list.add("apple");
    	      list.add("Banana");
    	      
    	      System.out.println(list);
    	      
    	      //create set from list..
    	      Set<String> set=new HashSet<>(list);
    	      System.out.println(set);
       }
}
