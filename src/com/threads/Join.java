package com.threads;

public class Join extends Thread {
       public void run() {
    	      for(int i=1;i<=5;i++) {
    	    	  try {
    	    		  Thread.sleep(1);
    	    	  }catch(Exception e) {
    	    		  System.out.println(e);
    	    	  }
    	    	  System.out.println(i);
    	      }
       }
       public static void main(String[]args) {
    	      Join t1=new Join();
    	      Join t2=new Join();
    	      Join t3=new Join();
    	      
    	      //THread t1 start
    	      t1.start();
    	      try {
    	    	  t1.join();
    	      }catch(Exception e) {
    	    	  System.out.println(e);
    	      }
    	      t2.start();
    	      t3.start();
    	      
    	     
       
       }
}
