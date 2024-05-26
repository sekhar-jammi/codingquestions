package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArrayToArraylist {
       public static void main(String[]args) {
    	   
    	    //USING Arrays.asList() method..
    	   
    	      /*String[] array=new String[] {"java","python","html","css"};
    	      
    	      ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
    	      
    	      System.out.println(list);*/
    	      
    	     //USING Collections.addAll() method..
    	       
    	     /* String[] array=new String[] {"java","python","html","css"};
    	      ArrayList<String> list=new ArrayList<>();
    	      Collections.addAll(list, array);
    	      System.out.println(list);*/
    	   
    	    //USING JAVA 8 streams..
    	    
    	   String[] array=new String[] {"java","python","html","css"};
    	   List<Object> list=Arrays.stream(array).collect(Collectors.toList());
    	   System.out.println(list);
       }
}
