package com.swap;

public class Swapping2twonumbers {
       public static void main(String[]args) {
    	      int a=50;
    	      int b=70;
    	      System.out.println("Before swapping numbers are.. " +a+ " " +b);
    	      
    	      //logic-1 creating third variable..
    	      //int t=a; //t=10
    	      //a=b;     //a=20
    	      //b=t;     //b=10
    	      
    	      // logic-2 using + and -  without using third variable..
    	      //a=a+b; //10+20=30    	      
    	      //b=a-b; //30-20=10
    	      //a=a-b; //30-20=20
    	      
    	      // logic-3 using * and / without using third variable..
    	      //a=a*b;  //10*20=200
    	      //b=a/b;  //200/20=10
    	      //a=a/b;  //200/10=20
    	      
    	      // logic-4 using single statement
    	      b=a+b-(a=b);  // this will assign b value to a and 30-20=10
    	      
    	      System.out.println("After swapping numbers are.. " +a+ " " +b);
       }
}
