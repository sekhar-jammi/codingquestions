package com.methodoverloading;


// when a class has more one method with same name but different arguments then it is called as method overloading..
//overloaded methods must have same name but different arguments..
//over loaded method can have same or different return types..
//overloaded method can have same or different visibility.
//overloaded methods can have static or non static methods..
// example os static binding.
//example of static polymorphism..

public class MethodOverLoading {
       public void sum(int a,int  b) {
    	   System.out.println(a+b);
       }
       public void sum(int a,int b, int c) {
    	   System.out.println(a+b+c);
       }
       
       public static void main(String[]args) {
    	   MethodOverLoading mo=new MethodOverLoading();
    	   mo.sum(1,2);
    	   mo.sum(1,2,3);
       }
}
