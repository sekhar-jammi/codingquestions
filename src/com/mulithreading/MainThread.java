package com.mulithreading;

public class MainThread {
       public static void main(String[]args) {
    	      Thread t=Thread.currentThread();
    	      System.out.println(t.getName());
    	      t.setName("my_main");
    	      System.out.println(t.getName());
       }
}

