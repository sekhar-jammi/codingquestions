package com.mulithreading;

public class Mythread extends Thread{
       public Mythread(String name) {
    	   super(name);
       }
       @Override
       public void run() {
    	   System.out.println("Hi iam Sekhar..");
       }
       
       public static void main(String[] args) {
    	      Mythread mythread=new Mythread("sekhar");
    	      mythread.start();
    	      //System.out.println(mythread.getName());
    	      mythread.setName("sai");
    	      System.out.println(mythread.getName());
       }
}
