package com.swap;

public class Removejunk {
       public static void main(String[] args) {
    	      String s="!@#$%^&&*() latin word string";
    	      s=s.replaceAll("[^a-zA-Z0-9]","");
    	      System.out.println(s);
       }
}
