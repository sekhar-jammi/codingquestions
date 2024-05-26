package com.exceptionhandling;

public class Finally {
       public static void main(String[]args) {
    	      try {
    	    	  System.out.println("inside try block..");
    	    	  //System.exit(0);
    	      }catch(Exception e){
    	    	  System.out.println("inside catch block..");
    	    	 // System.exit(0);
    	      }finally {
    	    	  System.out.println("inside finally block..");
    	      }
       }
}
