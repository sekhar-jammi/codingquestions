package com.exceptionhandling;

public class ArrayIndexOutOfBounds {
	/*public static void main(String[]args) {
	      int[] arr= {1,2,3,4,5};
	      try {
	      System.out.println(arr[2]);
	      }catch(Exception e) {
	    	  System.out.println("index outof bounds..");
	      }
}
	*/
	
	public static void main(String[]args) {
		   int[]arr= {1,2,3,4,5};
		   try {
			   for(int i=0;i<=5;i++) {
				   System.out.println(arr[i]);
			   }
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
		   //catch(ArrayIndexOutOfBoundsException e) {
		   //   e.printStackTrace();
		   //}
	}
}
