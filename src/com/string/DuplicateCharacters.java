package com.string;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {
       public static void duplicateCharacters(String inputString) {
    	      HashMap<Character,Integer> map=new HashMap<>();
    	      char[] strArray=inputString.toCharArray();
    	      for(char c:strArray) {
    	    	  if(map.containsKey(c)) {
    	    		  map.put(c, map.get(c)+1);
    	    	  }
    	    	  else {
    	    		  map.put(c, 1);
    	    	  }
    	      }
    	      Set<Character> set=map.keySet();
    	      for(char ch:set) {
    	    	  if(map.get(ch)>1) {
    	    		  System.out.println(ch+":"+map.get(ch));
    	    	  }
    	      }
       } 
       public static void main(String[]args) {
    	   duplicateCharacters("javaj2ee");
       }
}
