package com.exceptionhandling;

public class ArrayStoreException {
       public static void main(String[]args) {
    	   Number[] a=new Double[2];
    	   a[0]=1.0;
    	   a[1]=2.0;
    	   a[2]=3.0;
    	   System.out.println(a[0]);
    	   
       }
}
