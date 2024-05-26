package com.swap;

public class ReverseString {
       public static void main(String[] args) {
    	      String str="ABCD";
    	      String rev="";
    	      
    	      //Method-1 using string concatenation...
    	      
    	      /*int len=str.length();
    	      for(int i=len-1;i>=0;i--) {
    	    	  rev=rev+str.charAt(i);
    	      }
    	      System.out.println(rev);
    	      */
    	      
    	      //Method-2 using string character array..
    	      
    	      /*char a[]=str.toCharArray();
    	      int len =a.length;
    	      for(int i=len-1;i>=0;i--) {
    	    	  rev=rev+a[i];
    	      }
    	      System.out.println(rev);
    	      */
    	      
    	      //Method-3 using stringbuffer class..
    	      StringBuffer sb=new StringBuffer(str);
    	      System.out.println(sb.reverse());
       }
}
