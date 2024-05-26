package com.exceptionhandling;

public class IllegalStateException {
       public static void main(String[]args) {
    	   
    	   //calling thread again and again..
    	   
    	     Thread t=new Thread();
    	     //we dont get error..
    	     t.start();
    	     
    	     //here we get exception illegalthreadstateexception..
    	     t.start();
       }
}
