package com.swap;

public class SumOfArray {
       public static void main(String[]args) {
    	      int a[]= {5,4,3,2,1};
    	      int sum=0;
    	      /*for(int i=0;i<=a.length-1;i++) {
    	    	  sum=sum+a[i];
    	      }
    	      */
    	      
    	      //USING ENHANCE FORLOOP..
    	      for(int value:a) {
    	    	  sum=sum+value;
    	      }
    	      System.out.println("sum of array is:"+sum);
       }
}
