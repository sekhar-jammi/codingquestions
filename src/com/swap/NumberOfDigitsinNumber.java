package com.swap;

import java.util.Scanner;

public class NumberOfDigitsinNumber {
       public static void main(String[]args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("Enter a number:");
    	      int n=sc.nextInt();
    	      int count=0;
    	      while(n>0) {
    	    	  n=n/10;
    	    	  count++;
    	      }
    	      System.out.println("number of digits in number is: " + count );
       }
}
