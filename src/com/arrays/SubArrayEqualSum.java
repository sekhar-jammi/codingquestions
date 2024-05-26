package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SubArrayEqualSum {
       public static void main(String[]args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("enter length of array:");
    	      int size=sc.nextInt();
    	      int[] a=new int[size];
    	      System.out.println("enter arrays elements:");
    	      for(int i=0;i<size;i++) {
    	    	  a[i]=sc.nextInt();
    	      }
    	      System.out.println("enter required sum:");
    	      int reqSum=sc.nextInt();
    	      System.out.println("entered arrays is:"+Arrays.toString(a));
    	      System.out.println("arrays of sub arrays:");
    	      for(int i=0;i<a.length;i++) {
    	    	  int sum=0;
    	    	  for(int j=i;j<a.length;j++) {
    	    		  sum=sum+a[j];
    	    		  if(sum==reqSum) {
    	    			  System.out.println(Arrays.toString(Arrays.copyOfRange(a, i, j+1)));
    	    		  }
    	    	  }
    	      }
       }
}
