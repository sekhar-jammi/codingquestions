package com.EqualityOfArrays;

public class Main1 {
       public static void main(String[]args) {
    	   int[] arr1= {1,2,3,4,5};
    	   int[] arr2= {1,2,3,4,6};
    	   
    	   boolean equal=true;
    	   
    	   if(arr1.length==arr2.length) {
    		   for(int i=0;i<arr1.length;i++) {
    			   if(arr1[i]!=arr2[i]) {
    				  equal=false; 
    			   }
    		   }
    	   }else {
    		   equal=false;
    	   }
    	   if(equal){
    		   System.out.println("arrays are equal..");
    	   }else {
    		   System.out.println("arrays are not equal..");
    	   }
       }
}
