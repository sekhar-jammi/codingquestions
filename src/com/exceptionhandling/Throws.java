package com.exceptionhandling;

public class Throws {
       public int reminder(int n1,int n2)throws Exception{
    	      return n1/n2;
       }
       public static void main(String[]args) {
    	      Throws obj=new Throws();
    	      try {
    	    	  System.out.println(obj.reminder(20, 5));
    	      }catch(Exception e) {
    	    	  e.printStackTrace();
    	      }
       }
}
