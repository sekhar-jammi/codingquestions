package com.swap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArraylist {
       public static void main(String[] args) {
    	   List<String> synchronizedList=Collections.synchronizedList(new ArrayList<String>());
    	   
    	   synchronizedList.add("sekhar");
    	   synchronizedList.add("raja");
    	   synchronizedList.add("jammi");
    	   
    	   synchronized(synchronizedList){
    		   Iterator it=synchronizedList.iterator();
    		   while(it.hasNext())
    			   System.out.println(it.next());
    	   }
       }
}
