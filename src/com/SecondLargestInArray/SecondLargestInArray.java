package com.SecondLargestInArray;

public class SecondLargestInArray {
       public static void main(String[]args) {
    	      int[] a= {10,1,9,2,39,3,4,5};
    	      int temp;
    	      for(int i=0;i<a.length;i++) {
    	    	  for(int j=i+1;j<a.length;j++) {
    	    		  if(a[i]>a[j]) {
    	    			  temp=a[i];
    	    			  a[i]=a[j];
    	    			  a[j]=temp;
    	    		  }
    	    	  }
    	      }
    	      System.out.println(a[a.length-2]);
       }
}
