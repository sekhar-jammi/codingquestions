package com.exceptionhandling;

public class NumberFormatException {
	 /*public static void main(String[]args) {
	      int a=Integer.parseInt("123");
	      //int a=Integer.parseInt("b2");
	      //int a=Integer.parseInt("123 ");
	      //int a=Integer.parseInt(" 123");
	      System.out.println(a);
  }*/
	//How to avoid numberformat exception..
	  public static void main(String[]args) {
		     String str="123 ";
		     try {
		    	 int a=Integer.parseInt(str);
		    	 System.out.println(a);
		    	 
		     }catch(Exception e) {
		    	 System.out.println("invalid string argument..");
		     }
	  }
}
