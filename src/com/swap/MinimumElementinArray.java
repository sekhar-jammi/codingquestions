package com.swap;

public class MinimumElementinArray {
       public static void main(String[] args) {
    	      int[]a= {10,70,90,80,4,2};
    	      int min=a[0];
    	      for(int i=1;i<a.length;i++) {
    	    	  if(a[i]<min) {
    	    		  min=a[i];
    	    	  }
    	      }
    	      System.out.println("minimumm element in array is:"+min);
       }
}
