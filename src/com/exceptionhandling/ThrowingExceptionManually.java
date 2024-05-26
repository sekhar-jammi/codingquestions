package com.exceptionhandling;

public class ThrowingExceptionManually {
       public static void main(String[]args) {
    	      try {
    	    	  //creating object of arithmetic exception..
    	    	  ArithmeticException ae=new ArithmeticException();
    	    	  throw ae;
    	      }
    	      catch(ArithmeticException e) {
    	    	  System.out.println("manually thrown exception..");
    	      }
       }
}
