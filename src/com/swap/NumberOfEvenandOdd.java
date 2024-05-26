package com.swap;

import java.util.Scanner;

public class NumberOfEvenandOdd {
       public static void main(String[]args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("Enter a number:");
    	      int n=sc.nextInt();
    	      int even_count=0;
    	      int odd_count=0;
    	      while(n>0) {
    	    	  int rem=n%10;
    	    	  if(rem%2==0) {
    	    		  even_count++;
    	    	  }
    	    	  else {
    	    		  odd_count++;
    	    	  }
    	    	  n=n/10;
    	      }
    	      System.out.println(even_count);
    	      System.out.println(odd_count);
    	   
       }
}
