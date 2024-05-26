package com.string;

import java.util.Scanner;

public class RemoveWhiteSpaces {
  /*Method 1 public static void main(String[]args) {
    	      String str="Raja sekhar jammi";
    	      String str2=str.replaceAll(" ","");
    	      System.out.println(str);
    	      System.out.println(str2);;
       }*/
	
	/*Method-2*/
	    public static void main(String[]args) {
	    	   Scanner sc=new Scanner(System.in);
	    	   System.out.println("enter string:");
	    	   String str=sc.nextLine();
	    	   
	    	   String withoutSpaces="";
	    	   char[] strArray=str.toCharArray();
	    	   for(int i=0;i<strArray.length;i++) {
	    		   if(strArray[i]!=' ') {
	    			   withoutSpaces=withoutSpaces+strArray[i];
	    		   }
	    	   }
	    	   System.out.println(str);
	    	   System.out.println(withoutSpaces);
	    	   
	    }
}
