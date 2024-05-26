package com.swap;

import java.util.Arrays;

public class ArrayToString {
       public static void main(String[]args) {
    	      String[] starray= {"Raja","sekhar","jammi"};
    	      StringBuilder sb=new StringBuilder();
    	      for (int i=0;i<starray.length;i++) {
    	    	  sb.append(starray[i]);
    	      }
    	      System.out.println(sb);
       }
}
