package com.swap;

public class IsStringEmpty {
	   public static boolean isempty(String str) {
		      if(str.isEmpty())
		    	  return true;
		      else
		    	  return false;
		   
	   }
	   public static void main(String[] args) {
		      String str="rajasekhar";
		      String str1="";
		      System.out.println(str+ "is empty?  " +isempty(str));
		      System.out.println(str1+ "is empty? " +isempty(str1));
	   }

}
