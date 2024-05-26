package com.arrays;

import java.util.Arrays;

public class SeperateZeroFromNonZeros {
       public static void main(String[]args) {
    	      int[]myArray= {1,2,0,0,4,6,0,8};
    	      int pos = 0;
    	      for(int i=0; i<myArray.length; i++){
    	         if(myArray[i]!=0){
    	            myArray[pos]=myArray[i];
    	            pos++;
    	         }
    	      }
    	      while(pos<myArray.length) {
    	         myArray[pos] = 0;
    	         pos++;
    	      }
    	      System.out.println("The array created is: "+Arrays.toString(myArray));
       }
}
