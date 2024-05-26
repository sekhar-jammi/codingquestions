package com.swap;

public class MissingElementinArray {
       public static void main(String[] args) {
    	   int a[]= {1,2,4,5};
    	   int  sum1=0;
    	   for(int i=0;i<a.length;i++) {
    		   sum1=sum1+a[i];
    	   }
    	   System.out.println("summ of elements are:"+sum1);
    	   
    	   int sum2=0;
    	   for(int i=1;i<=5;i++) {
    		   sum2=sum2+i;
    	   }
    	   System.out.println("sum of range of elements are:"+sum2);
    	   System.out.println("missing number in arrys is:"+(sum2-sum1));
       }
}
