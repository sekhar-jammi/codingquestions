package com.swap;

public class PermutationsOfString {
       public static void StringPermutations(String str,String str2) {
    
       // checking if the string is empty..
    	   if(str.length()==0) {
    		   System.out.println(str2+" ");
    		   return;	   
    	   }
    	   for(int i=0;i<str.length();i++) {
    		   //ith character of th estring..
    		   char ch=str.charAt(i);
    		   //Rest of the string after excluding ith character of string..
    		   String str3=str.substring(0,i)+str.substring(i+1);
    		   //Recursive call..
    		   StringPermutations(str3,str2+ch);
    	   }
       }
       public static void main(String[]args) {
    	      String str="act";
    	      StringPermutations(str,"");
       }
}
