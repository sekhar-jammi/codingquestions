package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
       public static void main(String[]args) {
    	      ArrayList<String> list=new ArrayList<String>();
    	      list.add("add");
    	      list.add("sub");
    	      list.add("multi");
    	      list.add("div");
    	      System.out.println("Arraylist before reversing:..");
    	      System.out.println(list);
    	      
    	      Collections.reverse(list);
    	      
    	      System.out.println("Arraylist after reversing:....");
    	      System.out.println(list);
       }
}
