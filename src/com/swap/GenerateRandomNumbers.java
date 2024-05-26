package com.swap;

import java.util.Random;

public class GenerateRandomNumbers {
       public static void main(String[]args) {
    	   
    	   //APPROACH 1 USING RANDOM CLASS..
    	   
    	      Random rand=new Random();
    	      //int rand_int= rand.nextInt(100);  //ranges lies between 1 to 99..
    	      //System.out.println(rand_int);
    	      
    	      //double rand_double=rand.nextDouble(); //range lies between 0.0 and 1.0..
    	      //System.out.println(rand_double);
    	      
    	   // APPROACH 2 USING MATH CLASS..
    	      System.out.println(Math.random());
       }
}
