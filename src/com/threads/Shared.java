package com.threads;

public class Shared {
       synchronized void methodOne() {
    	   Thread t =Thread.currentThread();
    	   System.out.println(t.getName()+"is releasing lock and going to wait..");
    	   try {
    		   wait();   //releasing the lock of object and wait..
    	   }catch(InterruptedException e) {
    		   e.printStackTrace();
    	   }
    	   System.out.println(t.getName()+"got the object lock back and continue its execution...");
       }
       
       synchronized void methodTwo() {
    	   Thread t=Thread.currentThread();
    	   try {
    		   Thread.sleep(5000);
    	   }catch(InterruptedException e) {
    		   e.printStackTrace();
    	   }
    	   notify();  //waking the thread randomly  which are waiting lock.
    	   System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());
       } 
    	   
    	   public static void main(String[] args)
    	    {
    	        final Shared s = new Shared();
    	 
    	        Thread t1 = new Thread()
    	        {
    	            public void run()
    	            {
    	                s.methodOne();   //t1 calling methodOne() of 's' object
    	            }
    	        };
    	 
    	        Thread t2 = new Thread()
    	        {
    	            @Override
    	            public void run()
    	            {
    	                s.methodTwo();   //t2 calling methodTwo() of 's' object
    	            }
    	        };
    	        
    	        t1.start();
    	 
    	        t2.start();
    	    
       }
}
