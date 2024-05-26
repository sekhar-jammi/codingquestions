package com.swap;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {
       public static void main(String[]args) {
    	   
    	   //Creating string array..
    	   String[] array= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    	   int length=array.length;
    	   System.out.println("The string array elements are:");
    	   for(int i=0;i<length;i++) {
    		   System.out.println(array[i]+" ");
    	   }
    	   //Setting the cursor to nextline..
    	   System.out.println();
    	   
    	   //Converting  array to list..
    	   
    	   List convertedList=Arrays.asList(array);
    	   System.out.println("List elements after converting from array to list: ");
    	   System.out.println(convertedList);
       }
}
