package com.exceptionhandling;

public class Throw {
       public int reminder(int n1,int n2) {
    	   try {
    		   return n1/n2;
    	   }catch(Exception e) {
    		   throw e;
    	   }
       }
       public static void main(String[]args) {
    	      Throw obj=new Throw();
    	      try {
    	    	  System.out.println(obj.reminder(10, 0));
    	      }catch(Exception e) {
    	    	  e.printStackTrace();
    	      }
       }
    	      
    	             

}