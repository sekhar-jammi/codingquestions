package com.arrays;

import java.util.Arrays;

public class SegregationOfArray {
       public static void main(String[]args) {
    	      int[] a= {1,0,1,0,1,0};
    	      int size=a.length;
    	      int left=0;
    	      int right=size-1;
    	      while(left<right) {
    	    	  while(a[left]==0&&left<right)
    	    		  left++;
    	    	  while(a[right]==1&&left<right)
    	    		  right--;
    	    	  if(left<right) {
    	    		  a[left]=0;
    	    		  a[right]=1;
    	    		  left++;
    	    		  right--;
    	    	  }
    	      }
    	      System.out.println(Arrays.toString(a));
       }
}
