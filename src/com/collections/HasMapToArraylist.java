package com.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HasMapToArraylist {
       public static void main(String[]args) {
    	   
    	     HashMap<String,String> map=new HashMap<String,String>();
    	     
    	     map.put("sekhar", "avg");
    	     map.put("sai", "good");
    	     map.put("subbu", "bad");
    	     map.put("krishna","vergood");
    	     
    	     Set<String> keySet=map.keySet();
    	     
    	     ArrayList<String> listOfKeys=new ArrayList<>(keySet);
    	     
    	     System.out.println("Arraylist of keys..");
    	     for(String key:listOfKeys) {
    	    	 System.out.println(key);
    	     }
    	     System.out.println("------");
    	     
    	     Collection<String> values=map.values();
    	     
    	     ArrayList<String> listOfValues=new ArrayList<>(values);
    	     
    	     System.out.println("Arraylist of values...");
    	     for(String value:listOfValues) {
    	    	 System.out.println(value);
    	     }
    	     System.out.println("------");
    	     
    	     Set<Entry<String,String>> entrySet=map.entrySet();
    	     
    	     ArrayList<Entry<String,String>> listOfEntries=new ArrayList<>(entrySet);
    	     
    	     System.out.println("Arraylist of key:values...");
    	     for(Entry<String,String> entry:listOfEntries) {
    	    	 System.out.println(entry.getKey()+":"+entry.getValue());
    	     }

    	     }
}
