package com.swap;

import java.util.Scanner;

public class LargestOfThreeNumbers {
       public static void main(String[] args) {
    	      Scanner sc=new Scanner(System.in);
    	      System.out.println("enter first number:");
    	      int a=sc.nextInt();
    	      
    	      System.out.println("enter second number:");
    	      int b=sc.nextInt();
    	      
    	      System.out.println("enter third number:");
    	      int c=sc.nextInt();
    	      
    	      /*if(a>b && a>c) {
    	    	  System.out.println(a + " is largest is number.. ");
    	      }
    	      else if( b>a && b>c) {
    	    	  System.out.println(b + " is largest number... ");
    	      }
    	      else {
    	    	  System.out.println(c+ " is largest number..");
    	      }
    	      */
    	      
    	      //Ternary Operator..
    	      int largest=a>b?a:b;             // largest of a&b;
    	      int largest1=c>largest?c:largest; // largest of c and largest of a and b..
    	      System.out.println(largest1);
    	      
       }
}
