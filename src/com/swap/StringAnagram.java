package com.swap;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
       public static void main(String[] args) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter string1:");
    	   String str1=sc.nextLine();
    	   System.out.println("Enter string2:");
    	   String str2=sc.nextLine();
    	   
    	   str1=str1.replaceAll("\\s","");
    	   str2=str2.replaceAll("\\s","");
    	   
    	   if(str1.length()==str2.length()) {
    		   str1=str1.toLowerCase();
    		   str2=str2.toLowerCase();
    		   
    		   char[] str1charray=str1.toCharArray();
    		   char[] str2charray=str2.toCharArray();
    		   
    		   Arrays.sort(str1charray);
    		   Arrays.sort(str2charray);
    		   
    		   boolean result=Arrays.equals(str1charray,str2charray);
    		   if(result)
    			   System.out.println("string are anagrams..");
    		   else
    			   System.out.println("string are not anagrams..");
    	   }
    	   else {
    		   System.out.println("string are not anagrmas..");
    	   }
    	   
    	   
    	   
       }
}
