package com.threads;

public class UserToDaemon extends Thread {
	   
	  
	@Override
	   public void run() {
		      System.out.println("userthread..");
	   }
	   
	   public static void main(String[]args) {
		      UserToDaemon userthread=new UserToDaemon();
		      userthread.setDaemon(true);
		      userthread.start();
	   }
       
}
