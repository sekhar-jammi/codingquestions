package com.swap;

public class ReverseWordsString {
       public static void main(String[] args) {
    	   
    	     /* String s="welcome to java";
    	      String[] words=s.split(" ");
    	      String reverseString = "";
    	      for(String w:words) {
    	    	  String reverseWord="";
    	    	  for(int i=w.length()-1;i>=0;i--) {
    	    		  reverseWord=reverseWord+w.charAt(i);
    	    	  }
    	    	  reverseString=reverseString+reverseWord+" ";
    	      }
    	      System.out.println(reverseString);*/
    	      
    	   
    	   //APPROACH 2 USING STRING BUILDER...
    	      
    	      String s="welcome to java";
    	      String[] words=s.split(" ");
    	      String reverseWords="";
    	      
    	      for(String w:words) {
    	    	  StringBuilder sb= new StringBuilder(w);
    	    	  sb.reverse();
    	    	  
    	    	  reverseWords=reverseWords+sb.toString()+" ";
    	      }
    	      System.out.println(reverseWords);
    	      
    	   
    	      
       }
    	      
       
       
}
