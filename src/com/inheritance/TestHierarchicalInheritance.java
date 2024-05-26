package com.inheritance;

public class TestHierarchicalInheritance {
       public static void main(String[]args) {
    	      Cat c=new Cat();
    	      c.meow();
    	      c.eat();
    	 //     c.bark(); //Compile time error..because bark method is in Dog class
    	   
       }
}
