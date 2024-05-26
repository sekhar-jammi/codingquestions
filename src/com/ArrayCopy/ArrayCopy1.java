package com.ArrayCopy;

public class ArrayCopy1 {
       public static void main(String[]args) {
    	      int[] a= {1,2,3,4,5};
    	      /*int[] b=a;
    	      
    	      //printing elements of array b..
    	      for(int i=0;i<b.length;i++) {
    	    	  System.out.println(b[i]);
    	      }
    	      a[2]=10; //changing the 3rd value of array a..
    	      System.out.println(b[2]);*/
    	      int[] b=new int[a.length];
    	      for(int i=0;i<a.length;i++) {
    	    	  b[i]=a[i];
    	      }
       }
}
