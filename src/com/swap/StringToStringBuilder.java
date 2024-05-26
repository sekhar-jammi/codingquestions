package com.swap;

public class StringToStringBuilder {
       public static void main(String[] args) {
    	      String [] str= {"Jammi","raja","sekhar"};
    	      StringBuilder sb=new StringBuilder();
    	      sb.append(str[0]);
    	      sb.append(" "+str[1]);
    	      sb.append(" "+str[2]);
    	      System.out.println(sb);
    	      String str1=sb.toString();
    	      System.out.println(str1);
       }
}
