package com.EqualityOfArrays;

import java.util.Arrays;

public class Main2 {
       public static void main(String[]args) {
    	      String[] arr1= {"java","ruby","c++"};
    	      String[] arr2= {"abc","def","ghi"};
    	      String[] arr3= {"java","ruby","c++"};
    	      
    	      System.out.println(Arrays.equals(arr1,arr2));
    	      System.out.println(Arrays.equals(arr1,arr3));
       }
}
