package com.string;

public class ReverseString {
       public static void main(String[]args) {
    	      //StringBuffer sbf=new StringBuffer("java");
    	      //System.out.println(sbf.reverse());
    	   
    	     /*String str="java";
    	     String str2="";
    	     for(int i=str.length()-1;i>=0;i--) {
    	    	 str2=str2+str.charAt(i);
    	     }
    	     System.out.println(str2);*/
    	   
    	     String str="java";
    	     char[] strArray=str.toCharArray();
    	     for(int i=strArray.length-1;i>=0;i--) {
    	    	 System.out.println(strArray[i]);
    	     }
       }
}
