package com.swap;

import java.util.Scanner;

public class Palindromestring {
       public static void main(String[]args) {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter a string:");
              String orig_str=sc.next();
              String rev_str="";
              int len=orig_str.length();
              for(int i=len-1;i>=0;i--) {
            	  rev_str=rev_str+orig_str.charAt(i);
              }
              if(orig_str.equals(rev_str)) {
            	  System.out.println("string is palindrome..");
              }else 
              {
            	 System.out.println("string is not palindrome.."); 
              }
       }
}
