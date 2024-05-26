package com.ArrayCopy;

public class ArrayCOPY4 {
       public static void main(String[]args) {
    	      int[] a= {1,2,3,4,5};
    	      int[] b=a.clone();
    	      
    	      for(int i=0;i<b.length;i++) {
    	    	  System.out.println(b[i]);
    	      }
       }
}
