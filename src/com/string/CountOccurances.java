package com.string;

import java.util.HashMap;

public class CountOccurances {
       public static void characterCount(String inputString) {
              
    	     HashMap<Character,Integer> countMap=new HashMap<>();
    	     
    	     char[] strArray=inputString.toCharArray();
    	     
    	     for(char c:strArray) {
    	    	 if(countMap.containsKey(c)) {
    	    		 countMap.put(c,countMap.get(c)+1);
    	    	 }
    	    	 else {
    	    		 countMap.put(c, 1);
    	    	 }
    	     }
    	     System.out.println(inputString+" "+countMap);
       
       }
       public static void main(String[]args) {
    	   characterCount("rajsekhar jammi civil enginerer ggdghkjjh");
       }
}
