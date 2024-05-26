package com.swap;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleCollection {
       public static void main(String[]args) {
    	   
    	   //Creating arraylist..
    	      ArrayList<Integer> arraylist=new ArrayList<Integer>();
    	      arraylist.add(101);
    	      arraylist.add(102);
    	      arraylist.add(103);
    	      
    	      //Shuffling arraylist(collection)..
    	      Collections.shuffle(arraylist);
    	      System.out.println("arraylist after shuffling:"+arraylist);
       }
}
