package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHasMapByKeys {
      

	public static void main(String[]args) {
		   Map<String,Integer> studentMap=new HashMap<String,Integer>();
		   studentMap.put("Jyous", 87);
		   studentMap.put("Klusener", 82);
           studentMap.put("Xiangh", 91);
		   studentMap.put("Lisa", 89);
		   studentMap.put("Narayan", 95);
		   studentMap.put("Arunkumar", 86);
		   
		   Map<String,Integer> sortedstudentMap=new TreeMap<>(studentMap);
		   System.out.println("Map before sorting:..");
		   System.out.println(studentMap);
		   System.out.println("Map after sortiing:...");
		   System.out.println(sortedstudentMap);
       }
}
