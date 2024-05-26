package com.customexception;

public class InsufficientFundsException extends RuntimeException{
       InsufficientFundsException(String msg){
    	   super(msg);
       }
}
