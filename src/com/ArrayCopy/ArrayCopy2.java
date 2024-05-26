package com.ArrayCopy;

public class ArrayCopy2 {
       public static void main(String[]args) {
    	      int [] a= {1,2,3,4,5};
    	      int[] b=new int[a.length];
    	      
    	      for(int i=0;i<a.length;i++) {
    	    	  b[i]=a[i];
    	    	  System.out.println(b[i]);
    	      }
    	      a[2]=10;
    	      System.out.println(b[2]);
    	      
       }
}
