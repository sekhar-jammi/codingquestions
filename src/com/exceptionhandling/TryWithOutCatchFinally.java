package com.exceptionhandling;

import java.util.Scanner;

public class TryWithOutCatchFinally {
       public static void main(String[]args) {
    	      try(Scanner sc=new Scanner(System.in)){
    	    	  System.out.println("try block without catch/finally blocks..");
    	      }
       }
}
