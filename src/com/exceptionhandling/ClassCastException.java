package com.exceptionhandling;

public class ClassCastException {
       public static void main(String[]args) {
    	   
    	   //Here we are trying to cast subclass type to super class here we dont get error...(String to Object)...
    	      String str=new String("Sekhar");
    	      Object o=(Object)str;
    	      System.out.println(o);
    	      
    	      
    	      //Here we are trying to cast superclass to child class (Object to String).. we will get error here...
    	      Object o1=new Object();
    	      String str1=(String)o1;
    	      System.out.println(str1);;
    	      
    	      //Here we dont get error because we are creating string using super class Object ....
		     // Object o2=new String("Rajasekhar");
		     // String str2=(String)o2;
		      //System.out.println(str2);
    	      
    	      
       }
}
