package com.string;

import java.util.Scanner;

public class ReverseStringWordByWord {
       
    public static String reverseString(String str) {
    	   String reverseString="";
    	   String[] words=str.split("\\s");
    	   for(int i=words.length-1;i>=0;i--) {
    		   reverseString=reverseString+words[i]+" ";
    	   }
    	   return reverseString;
    }	
    public static void main(String[] args) {
    	  String str="java concept of the day";
    	  String reverseString=reverseString(str);
    	  System.out.println(str);
    	  System.out.println(reverseString);
    }
       
} 
