package com.swap;

public class LargestAndSmallestInArray {
       public static void main(String[]args) {
    	      int[] arr=new int[] {1,10,20,5,100,60,70,90};
    	      int largest=arr[0];
    	      int smallest=arr[0];
    	      for(int number:arr) {
    	    	  if(largest<number) {
    	    		  largest=number;
    	    	  }
    	    	  else if(smallest>number){
    	    		  smallest=number;
    	    		  
    	    	  }
    	      }
    	      System.out.println("largest and smallest numbers in array are: " + largest + " and " + smallest);
    	      
       }
       
       //int a[]=new int[3] {1,2,3};
}
