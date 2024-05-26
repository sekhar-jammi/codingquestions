package com.swap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {
       

	public static void main(String[]args) throws Exception{
    	   try {
    		 // creating object of arraylist string..
    		   List<String> list=new ArrayList<String>();
    		   list.add("Bangalore");
    		   list.add("Hyderabad");
    		   list.add("Chennai");
    		   
    		   //displaying the initiallist..
    		   System.out.println("the initial arrayslist:"+list);
    		   
    		   //using unmodifiablelist() method..
    		   List<String> read_only_list=Collections.unmodifiableList(list);
    		   System.out.println(read_only_list);
    		   
    		   //Trying to add element to unmodifiable list..
    		   read_only_list.add("Mysore");
    	   }
    	   catch(UnsupportedOperationException e){
    		   System.out.println("The Exception is thrown is:"+e);
    		   
    	   }
       }
}
