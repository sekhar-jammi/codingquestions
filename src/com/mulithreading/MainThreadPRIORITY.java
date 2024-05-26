package com.mulithreading;

public class MainThreadPRIORITY {
       public static void main(String[] args) {
    	      Thread t=Thread.currentThread();
    	      System.out.println(t.getPriority());
    	      t.setPriority(8);
    	      System.out.println(t.getPriority());
       }
}
