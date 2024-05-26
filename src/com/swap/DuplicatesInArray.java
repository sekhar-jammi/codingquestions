package com.swap;

import java.util.HashSet;

public class DuplicatesInArray {
       public static void main(String[] args) {
    	      String [] arr= {"a","b","c","b","c"};
    	      //APPROACH 1
    	      /*boolean flag=false;
    	      for(int i=0;i<arr.length;i++) {
    	    	  for(int j=i+1;j<arr.length;j++) {
    	    		  if(arr[i]==arr[j]) {
    	    			  System.out.println("duplicate element found at :"+arr[i]);
    	    			  flag=true;
    	    		  }
    	    	  }
    	      }
    	      if(flag==false) {
    	    	  System.out.println("duplicate elemnets are not found..");
    	      }
    	      */
    	      
    	      //APPROACH 2 USING HASH SET
    	      HashSet <String> langs=new HashSet();
    	      boolean flag=false;
    	      for(String l:arr) {
    	    	  if(langs.add(l)) {
    	    		  System.out.println("Duplicate element found at"+l);
    	    		  flag=true;
    	    	  }
    	    	  
    	      }
    	      if(flag==false) {
    	    	  System.out.println("Duplicate elements are not found...");
    	      }
       }
}
