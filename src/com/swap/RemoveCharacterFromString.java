package com.swap;

public class RemoveCharacterFromString {
       public static void main(String[]args) {
    	      String str="Rajasekhar";
    	      //Removing specific character from string..
    	      System.out.println("Removing specific character:"+str.replace("a",""));
    	      //Removing first occurance of specific character..
    	      System.out.println("Removing first occurance:"+str.replaceFirst("a",""));
    	      //Removing all  occurnaces..
    	      System.out.println("Removing all occurances:"+str.replaceAll("A-Z",""));
       }
}
