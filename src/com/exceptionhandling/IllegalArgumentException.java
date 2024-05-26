package com.exceptionhandling;

public class IllegalArgumentException {
       public static void main(String[]args) {
    	  
    	   //Illegal ArgumentException:Invoking method with inappropriate argument then it was called IllegalArgumentException..
    	   
    	   
    	   //default initial setpriority of thread is 0to10
    	   Thread t=new Thread();
    	   
    	   //we dont get error..
    	   t.setPriority(10);
    	   
    	   //we get  error as we gave priority of 100..
    	   
    	   t.setPriority(100);
       }
}
