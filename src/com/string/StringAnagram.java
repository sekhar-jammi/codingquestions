package com.string;

import java.util.Arrays;

public class StringAnagram {
       public static void main(String[]args) {
    	      String str1="java";
    	      String str2="jvva";
    	      
    	      str1.replaceAll("\\s", "");
    	      str2.replaceAll("\\s", "");
    	      
    	      if(str1.length()==str2.length()) {
    	    	  str1=str1.toLowerCase();
    	    	  str2=str2.toLowerCase();
    	    	  
    	    	  char[] str1Array=str1.toCharArray();
    	    	  char[] str2Array=str2.toCharArray();
    	    	  
    	    	  boolean result=true;
    	    	  
    	    	  result=Arrays.equals(str1Array,str2Array );
    	    	  
    	    	  if(result)
    	    		  System.out.println("angrams..");
    	    	  else
    	    		  System.out.println("strinds are not angrams..");
    	    	  
    	      }else {
    	    	  System.out.println("not anagrams..");
    	      }
       }
}
