package com.swap;

public class EvenandOddinArray {
       public static void main(String[] args) {
    	      int a[]= {1,2,3,4,5,6,7,8,9,10};
    	      
    	      //APPROACH 1
    	      /*
    	      System.out.println("Even numbers in arraya are:");
    	      for(int i=0;i<a.length;i++) {
    	    	  if(a[i]%2==0)
    	    		  System.out.println(a[i]);
    	      }
    	      
    	      System.out.println("Odd numbers are:");
    	      for(int i=0;i<a.length;i++) {
    	    	  if(a[i]%2!=0)
    	    		  System.out.println(a[i]);
    	      }
    	      */
    	      
    	      //APPROACH 2
    	      
    	      System.out.println("Even numbers in array are:");
    	      for(int value:a) {
    	    	  if(value%2==0)
    	    		  System.out.println(value);
    	      }
    	      
    	      System.out.println("Odd numbers are:");
    	      for(int value:a) {
    	    	  if(value%2!=0)
    	    		  System.out.println(value);
    	      }
    	      
       }
}
