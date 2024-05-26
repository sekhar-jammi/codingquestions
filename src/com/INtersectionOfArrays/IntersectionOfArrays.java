package com.INtersectionOfArrays;

import java.util.HashSet;

public class IntersectionOfArrays {
       public static void main(String[]args) {
    	      Integer[] a= {1,2,3,4,5};
    	      Integer[] b= {3,4,5,6,7};
    	      HashSet<Integer> set=new HashSet<>();
    	      for(int i=0;i<a.length;i++) {
    	    	  for(int j=0;j<b.length;j++) {
    	    		  if(a[i].equals(b[j])) {
    	    			  set.add(a[i]);
    	    		  }
    	    	  }
    	      }
    	      System.out.println(set);
       }
}
