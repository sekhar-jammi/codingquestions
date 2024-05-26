package com.string;

public class RotationIsString {
       public static void main(String[]args) {
    	   String str1="abcd";
    	   String str2="dgba";
    	   
    	   String rot="";
    	   
    	   for(int i=str1.length()-1;i>=0;i--) {
    		   rot=rot+str1.charAt(i);
    	   }
    	   if(rot.equals(str2)) {
    		   System.out.println("string is rotation of string..");
    	   }else {
    		   System.out.println("string is not rotation of string.");
    	   }
       }
}
