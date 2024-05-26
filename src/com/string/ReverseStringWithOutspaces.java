package com.string;

public class ReverseStringWithOutspaces {
       public static void main(String[]args) {
    	      String str="raja sekhar jammi";
    	      
    	      char[] strArray=str.toCharArray();
    	      
    	      char[] resArray=new char[strArray.length];
    	      
    	      for(int i=0;i<strArray.length;i++) {
    	    	  if(strArray[i]==' ') {
    	    		  resArray[i]=' ';
    	    	  }
    	      }
    	      
    	      int j=resArray.length-1;
    	      for(int i=0;i<strArray.length;i++) {
    	    	  if(strArray[i]!=' ') {
    	    		  if(resArray[i]==' ') {
    	    			  j--;
    	    		  }
    	    		  resArray[j]=strArray[i];
    	    		  j--;
    	    	  }
    	      }
    	      System.out.println(String.valueOf(resArray));
       }
}
