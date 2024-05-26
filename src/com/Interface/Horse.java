package com.Interface;

public class Horse implements Animal{
       public void walk() {
    	    System.out.println("Horse will walk on 4legs..");
       }
       
       public static void main(String[]args) {
    	   Horse h=new Horse();
    	   h.walk();
       }
}
