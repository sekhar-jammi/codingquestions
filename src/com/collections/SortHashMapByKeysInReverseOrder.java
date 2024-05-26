package com.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeysInReverseOrder {
       public static void main(String[]args) {
    	      Map<String,Integer> studentMap=new HashMap<>();
    	        studentMap.put("Jyous", 87);
    	        studentMap.put("Klusener", 82);
    	        studentMap.put("Xiangh", 91);
    	        studentMap.put("Lisa", 89);
    	        studentMap.put("Narayan", 95);
    	        studentMap.put("Arunkumar", 86);
    	        
    	     Map<String,Integer>sortedstudentMap=new TreeMap<>(Collections.reverseOrder())   ;
    	     sortedstudentMap.putAll(studentMap);
    	     
    	     System.out.println("before sorting:");
    	     System.out.println(studentMap);
    	     
    	     System.out.println("after sorting in reverse:");
    	     System.out.println(sortedstudentMap);
       }
}
