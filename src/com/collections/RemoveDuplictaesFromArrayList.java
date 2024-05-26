package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplictaesFromArrayList {
       public static void main(String[]args) {
    	      ArrayList<String> listWithDuplicates=new ArrayList<>();
    	      listWithDuplicates.add("JAVA");
    	      listWithDuplicates.add("PYTHON");
    	      listWithDuplicates.add("HTML");
    	      listWithDuplicates.add("CSS");
    	      listWithDuplicates.add("JAVA");
    	      listWithDuplicates.add("PYTHON");
    	      
    	      System.out.println("Arraylist wih duplicate elements:");
    	      System.out.println(listWithDuplicates);
    	      
    	      HashSet<String> set=new HashSet<String>(listWithDuplicates);
    	      
    	      
    	      System.out.println("Arraylist without duplictates:");
    	      ArrayList<String> listWithOutDuplicates=new ArrayList<String>(set);
    	      System.out.println(listWithOutDuplicates);
    	      
    	      
       }
}
