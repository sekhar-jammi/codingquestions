package com.swap;

import java.util.Scanner;

public class Palindromenumber {
       public static void main(String[]args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("Enter a number:");
    	      int n=sc.nextInt();
    	      int rev=0;
    	      
    	      while (n!=0)
    	      {
    	    	  rev=(rev*10)+(n%10);
    	    	  n=n/10;
    	      }
    	      
    	      System.out.println(rev);
    	      
    	      if(n==rev){
    	    	  System.out.println("number is palindrome..");
    	      }
    	      else 
    	      {
    	    	  System.out.println("number is not palindrome..");
    	      }
  	      
       }
}
