package com.swap;

import java.util.TreeSet;

public class CloneTreeSet {
       public static void main(String[]args) {
    	   
    	   //Creating treeset..
    	      TreeSet<String> treeset=new TreeSet<String>();
    	      treeset.add("MOnday");
    	      treeset.add("tuesday");
    	      treeset.add("wednesday");
    	   //printing original treeset objects..
    	      System.out.println("original treeset:"+treeset);
    	      //cloning treeset into another treeset..
    	      TreeSet<String> clonedTreeset=(TreeSet<String>)treeset.clone();
    	      System.out.println("cloned treeset:"+clonedTreeset);
    	      
    	      
    	      
       }
}
