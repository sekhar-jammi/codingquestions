package com.swap;

public class CountOccurancesinString {
       public static void main(String[] args) {
    	      String s="java programming by rajasekhar";
    	      int total_length=s.length();
    	      int length_after_removing_a=s.replace("a","" ).length();
    	      int count=total_length-length_after_removing_a;
    	      System.out.println(" a occurs in string : " +count+ " times ");
       }
}
