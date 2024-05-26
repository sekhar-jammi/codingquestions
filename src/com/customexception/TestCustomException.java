package com.customexception;

public class TestCustomException {
       public static void main(String[]args) {
    	      int age=25;
    	      if(age<25) {
    	    	  throw new TooYoungException("please wait for some more time..");
    	      }
    	      else {
    	    	  System.out.println("welcome..");
    	      }
       } 
}
