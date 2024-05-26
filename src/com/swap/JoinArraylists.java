package com.swap;

import java.util.ArrayList;

public class JoinArraylists {
        public static void main(String[] args) {
               ArrayList<String> list1=new ArrayList<String>();
               list1.add("a");
               list1.add("b");
               System.out.println(list1);
               
               ArrayList<String> list2=new ArrayList<String>();
               list2.add("c");
               list2.add("d");
               System.out.println(list2);
               
               ArrayList<String> joinedArrayList=new ArrayList<String>();
               joinedArrayList.addAll(list1);
               joinedArrayList.addAll(list2);
               System.out.println(joinedArrayList);
               
               
        }
}
