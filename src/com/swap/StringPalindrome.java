package com.swap;

import java.util.Scanner;

public class StringPalindrome {
	   public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter the string:");
		      String str1=sc.nextLine();
		      String revstr="";
		      
		      int len=str1.length();
		      for(int i=len-1;i>=0;i--) {
		    	  revstr=revstr+str1.charAt(i);
		      }
		      if(str1.equalsIgnoreCase(revstr)) {
		    	  System.out.println("string is palindrome..");
		      }
		      else {
		    	  System.out.println("string is not palindrome..");
		      }
	   }

}
