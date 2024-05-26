package com.customexception;

public class TestInsufficientFundsException {
       public static void main(String[]args) {
    	     double balance=10000;
    	     double withdrawl=2000;
    	     
    	     if(withdrawl>=balance) {
    	    	 throw new InsufficientFundsException("you dont have enough funds ...");
    	    	 
    	     }
    	     else {
    	    	 System.out.println("wait for money ..");
    	     }
       }
}
