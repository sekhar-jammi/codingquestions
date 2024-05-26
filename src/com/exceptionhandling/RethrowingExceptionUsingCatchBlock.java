package com.exceptionhandling;

public class RethrowingExceptionUsingCatchBlock {
       public static void main(String[]args) {
    	   try {
    		   ArithmeticException ae=new ArithmeticException();
    		   throw ae;
    	   }
    	   catch(ArithmeticException e) {
    		   System.out.println("rethrowing exception using catch block below");
    		   throw e;
    	   }
       }
}
