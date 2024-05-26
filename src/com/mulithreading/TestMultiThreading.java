package com.mulithreading;

public class TestMultiThreading {
	   public static void main(String[] args) {
       Thread1 t1= new Thread1();
       t1.start();
       
       Thread2 t2=new Thread2();
       t2.start();
       System.out.println(t2.getName());
	   
	   
	   
	   }
}
