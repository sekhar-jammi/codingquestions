package com.swap;

public class SearchingElementByLinearSearch {
       public static void main(String[] args) {
    	      int[]a= {10,20,30,40,50,30};
    	      int search_ele=100;
    	      boolean flag=false;
    	      for(int i=0;i<a.length;i++) {
    	    	  if(search_ele==a[i]) {
    	    		  System.out.println("element found at:"+i);
    	    		  flag=true;
    	    		  
    	    	  }
    	      }
    	      if(flag==false) {
    	    	  System.out.println("element not found..");
    	      }
       }
}
