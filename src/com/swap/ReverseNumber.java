package com.swap;

import java.util.Scanner;

public class ReverseNumber {
       public static void main(String[] args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("Enter a number:");
    	      int n=sc.nextInt();
    	      
    	      //Method-1 using algorithm..
    	      /*int rev=0;
    	      while(n!=0) {
    	    	  rev=(rev*10)+(n%10);
    	    	  n=n/10;
    	      }
    	      */
    	      
    	      // Method-2 using StringBufferclass..
    	      
    	     /* StringBuffer sb=new StringBuffer(String.valueOf(n));
    	      StringBuffer rev=sb.reverse();
              System.out.println(rev);
              */
    	      
    	      // Method-3 using string builder class...
    	      
    	      StringBuilder sb1=new StringBuilder();
    	      sb1.append(n);
    	      StringBuilder rev=sb1.reverse();
    	      System.out.println(rev);
       }
       
}
