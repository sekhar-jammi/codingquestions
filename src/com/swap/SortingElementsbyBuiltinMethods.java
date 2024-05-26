package com.swap;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsbyBuiltinMethods {
       public static void main(String[] args) {
    	   
    	   //APPROACH 1
    	   /*
    	   int a[]= {20,70,80,40,100,60};
    	   System.out.println("Array before sorting:"+Arrays.toString(a));
    	   Arrays.sort(a);
    	   System.out.println("Array after sorting:"+Arrays.toString(a));
    	   */
    	   
    	   //APPROACH 2
    	   
    	   /*
    	   int [] a= {10,40,30,80,90};
    	   System.out.println("Array before sorting:"+Arrays.toString(a));
    	   Arrays.parallelSort(a);
    	   System.out.println("Arrays after sorting:"+Arrays.toString(a));
    	   */
    	   
    	   //APPROACH 3
    	   // this will give in descending order..
    	   // this method will not work for primitive data types only applicable for derived datatypes..
    	   Integer[] a= {30,80,40,60,70,100};
    	   System.out.println("Array before soting :"+Arrays.toString(a));
    	   Arrays.sort(a,Collections.reverseOrder());
    	   System.out.println("Array after sorting:"+Arrays.toString(a));
    	   
       } 
}
