package com.swap;

public class TargetElementInArray {
       public static void main(String[]args) {
    	      int[] arr= {1,2,3,4,5};
    	      int target=5;
    	      for(int i=0;i<arr.length;i++) {
    	    	  if(target==arr[i]) {
    	    		  System.out.println("Target element is present at index " + i);
    	    		  return;
    	    	  }
    	      }
    	      System.out.println(-1);
       }
}
