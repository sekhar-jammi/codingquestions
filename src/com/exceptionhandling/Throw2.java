package com.exceptionhandling;

public class Throw2 {
       /*public static void main(String[]args) {
    	      try {
    	    	  int value=5;
    	    	  if(value<10)
    	    		  throw new RuntimeException("value is less than 10..");
    	    	  
    	      }catch(RuntimeException re) {
    	    	  System.out.println(re.getMessage());
    	      }
    	      System.out.println("outside try-catch block///");
       }*/
	
	   public static void main(String[]args) {
		   try {
			   for (int i = 1; i <= 5; i++) {
			    System.out.print(i + " ");
			   int a = 20;
			   int b = 0;
			   int c = a/b;
			   System.out.println(c);
			   }
			   }
			   catch (ArithmeticException ae) {
				   //System.out.println("catchedd..");
			   }
		   
		   
	   }
	   
}
