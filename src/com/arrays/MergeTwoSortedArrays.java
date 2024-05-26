package com.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
       public static void main(String[] args) {
    	      int[] arr1= {1,2,3,4};
    	      int[] arr2= {5,6,7,8};
    	      int n1=arr1.length;
    	      int n2=arr2.length;
    	      int[] arr3=new int[n1+n2];
    	      int i=0;
    	      int j=0;
    	      int k=0;
    	      while( i<n1) {
    	    	  arr3[k++]=arr1[i++];
    	      }
    	      while(j<n2) {
    	    	  arr3[k++]=arr2[j++];
    	      }
    	      System.out.println(Arrays.toString(arr3));
       }
}
