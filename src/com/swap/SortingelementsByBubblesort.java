package com.swap;

import java.util.Arrays;

public class SortingelementsByBubblesort {
       public static void main(String[] args) {
    	      int[] a= {5,4,3,2,1};
    	      
    	      System.out.println("arrays before sorting is:"+Arrays.toString(a));
    	      int n=a.length;
    	      for(int i=0;i<n-1;i++) {     //no of passes
    	    	  for(int j=0;j<n-1;j++) { // iterating over array elements and compare with each and every element..
    	    		  if(a[j]>a[j+1]) {    //ASCENDING ORDER.1, 2,3,4,5
    	    			  int temp=a[j];   //DESCENDING ORDER a[j]<a[j+1]
    	    			  a[j]=a[j+1];
    	    			  a[j+1]=temp;
    	    		  }
    	    	  }
    	      }
    	      System.out.println("arrays after sorting is:"+Arrays.toString(a));
       }
}
