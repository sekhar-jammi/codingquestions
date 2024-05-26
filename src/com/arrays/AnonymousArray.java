package com.arrays;

public class AnonymousArray {
       static void sum(int[]a) {
    	    int total=0;
    	    for(int i:a)
    	    	total=total+i;
    	    System.out.println(total);
       }
       public static void main(String[]args) {
    	    //Anonymous Array..
    	    sum(new int[] {1,2,3});
       }
}
