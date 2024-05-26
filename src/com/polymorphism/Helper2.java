package com.polymorphism;


//program to polymorphism with different number of parameters..
public class Helper2 {
	
	  // method with two parameters..
       static int multiply(int a,int b) {
    	   return a*b;
       }
       
       //method with three parameters...
       static int multiply(int a,int b, int c) {
    	   return a*b*c;
       }
       
       public static void main(String[]args) {
    	   System.out.println(multiply(2,3));
    	   System.out.println(multiply(2,3,4));
       }
}
