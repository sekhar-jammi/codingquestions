package com.swap;

public class CountOccurances {
       public static void main(String[] args) {
    	      String str="techie";
    	      char ch='e';
    	      int count=0;
    	      for(int i=0;i<str.length();i++) {
    	    	  if(str.charAt(i)==ch) {
    	    		  count++;
    	    	  }
    	      }
    	      System.out.println(count);
       } 
}
