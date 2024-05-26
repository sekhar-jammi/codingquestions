package com.string;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharacters {
       public static void main(String[] args) {
    	     String str1="Raja sekhar jammi";
    	     String str2="sai babu jammi";
    	      
    	     char[] str1Array=str1.replaceAll("\\s", "").toCharArray();
    	     char[] str2Array=str2.replaceAll("\\s", "").toCharArray();
    	     
    	     Set<Character> str1set=new TreeSet<>();
    	     Set<Character> str2set=new TreeSet<>();
    	     
    	     for(char c:str1Array) {
    	    	 str1set.add(c);
    	     }
    	     for(char c:str2Array) {
    	    	 str2set.add(c);
    	     }
    	     str1set.retainAll(str2set);
    	     System.out.println(str1set);
    	     System.out.println("count:"+str1set.size());
       }
        
}
