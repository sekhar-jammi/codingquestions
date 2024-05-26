package com.swap;

public class MaxElementinArray{
	   public static void main(String[] args) {
		      int a[]= {20,80,90,50,40,200};
		      int max=a[0];
		      for(int i=1;i<a.length;i++) {
		    	  if(a[i]>max) {
		    		  max=a[i];
		    	  }
		      }
		      System.out.println("max elemnt in array is:" +max);
	   }
}