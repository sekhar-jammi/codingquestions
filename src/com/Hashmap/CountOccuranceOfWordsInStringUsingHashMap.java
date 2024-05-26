package com.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfWordsInStringUsingHashMap {
       public static void main(String[]args) {
    	    /*  String str="Alice is girl and bob is boy bob alice";
    	      
    	      //Declaring HashMap of <String Integer>
    	      Map<String,Integer> hashMap=new HashMap<>();
    	      
    	      //Splitting the words of string into string array..
    	      String[] words=str.split(" ");
    	      
    	      for(String word:words) {
    	    	  //Asking whether hashMap contains the key or not will return null if not..
    	    	  Integer integer=hashMap.get(word);
    	    	  if(integer==null)
    	    	  //Storing the word as key and its occurance as value in hashmap..
    	    		  hashMap.put(word, 1);
    	    	  else {
    	    	  //incrementing the value if the word is already present in the hashmap..
    	    		  hashMap.put(word, integer+1);
    	    	  }
    	      }
    	      System.out.println(hashMap);
    	      */
    	   
    	    //method 1 
    	    /* String str="jammi raja sekhar yadav and jammi sai babu yadav";
    	     Map<String,Integer> hashMap=new HashMap<>();
    	     String[] words=str.split(" ");
    	     for(String word:words) {
    	    	 Integer integer=hashMap.get(word);
    	    	 if(integer==null)
    	    		 hashMap.put(word, 1);
    	    	 else {
    	    		 hashMap.put(word, integer+1);
    	    	 }
    	    	
    	    	 
    	     }
    	     System.out.println(hashMap);
    	     */ 
    	   
    	   //Method 2
    	   String str="alice is girl and bob is boy and girl";
    	   Map<String,Integer> hashMap=new HashMap<>();
    	   String[] words=str.split(" ");
    	   for(String word:words) {
    		   if(hashMap.containsKey(word))
    			   hashMap.put(word,hashMap.get(word)+1);
    		   else 
    			   hashMap.put(word,1);
    			   
    		   
    		   
    	   }
    	   System.out.println(hashMap);
    	   
       } 
}
