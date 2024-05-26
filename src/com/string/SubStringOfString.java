package com.string;

public class SubStringOfString {
       public static void main(String[]args) {
    	      String str="java";
    	      System.out.println("substrings of"+str+"are:");
    	      for(int i=0;i<str.length();i++) {
    	    	  for(int j=i+1;j<=str.length();j++) {
    	    		  System.out.println(str.substring(i,j));
    	    	  }
    	      }
       }
}
