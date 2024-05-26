package com.largestAndSmallestINArray;

public class LarestAnsSmallestInArray {
       public static void main(String[]args) {
    	      int[]a= {1,2,3,4,5,6,7,8,9,10};
    	      int largest=a[0];
    	      int smallest=a[0];
    	      for(int n:a) {
    	    	  if(largest<n) {
    	    		  largest=n;
    	    	  }else if(smallest>n) {
    	    		  smallest=n;
    	    	  }
    	      }
    	      System.out.println("smallest number is:" +smallest+ " largest number is: " + largest);
       } 
}
