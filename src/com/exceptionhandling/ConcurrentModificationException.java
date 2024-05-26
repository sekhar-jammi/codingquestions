package com.exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ConcurrentModificationException is the child class of RunTimeException and hence it is unchecked exception.
//when one thread is iterating over collection and some other thread is modifying the same collection then we will get concurrentmodification exception.
public class ConcurrentModificationException {
       public static void main(String[]args) {
    	      List<String> mobiles=new ArrayList<>();
    	      mobiles.add("Redmi");
    	      mobiles.add("Apple");
    	      mobiles.add("Nokia");
    	      mobiles.add("Realme");
    	      mobiles.add("Samsung");
    	      
    	      //printing elements before removing element
    	      System.out.println(mobiles);
    	      
    	      //Here we are using arraylisr's remove method to remove element then it will give exception..
    	      
    	      
    	     /* for(String phone:mobiles) {
    	    	  if(phone.equals("Apple")) {
    	    		  mobiles.remove(phone);
    	    	  }
    	      }*/
    	      
    	      //To avoid this exception we have to use Iterator's remove() method to remove element while iterating over collection...
    	      
    	      Iterator<String> itr=mobiles.iterator();
    	      while(itr.hasNext()) {
    	    	  String phone=itr.next();
    	    	  if(phone.equals("Apple")) {
    	    		  itr.remove();
    	    	  }
    	      }
    	      
    	      System.out.println(mobiles);
       }
}
