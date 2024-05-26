package com.polymorphism;

// java programm to method overloading with different types of parameters..
public class Helper {
	
	   //method with integer parameters..
       static int multiply(int a,int b) {
    	      return a*b;
       }
       
       //method with sam name but different parameters type..
       static double multiply(double a,double b) {
    	      return a*b;
       }
       
       public static void main(String[] args) {
    	     System.out.println(Helper.multiply(3, 4));
    	     System.out.println(Helper.multiply(5.4, 4.5));
       }
}
