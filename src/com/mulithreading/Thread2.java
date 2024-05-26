package com.mulithreading;

public class Thread2 extends Thread{
        @Override
	    public void run() {
    	   for(int i=1000;i<=2000;i++) {
    		   System.out.println(i);
    	   }
       }
}
