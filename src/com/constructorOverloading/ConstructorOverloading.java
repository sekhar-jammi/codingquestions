package com.constructorOverloading;

public class ConstructorOverloading {
       int id;
       String name;
       
       ConstructorOverloading(){
    	   System.out.println("default constructor:");
       }
       ConstructorOverloading(int i,String n){
    	   System.out.println("parameter constructor:");
       }
       public static void main(String[]args) {
       ConstructorOverloading c=new ConstructorOverloading();
       System.out.println("student id:"+c.id+"\nstudent name:"+c.name);
       
       ConstructorOverloading c2=new ConstructorOverloading(102,"sekhar");
       System.out.println("student id:"+c2.id+"\nstudent name:"+c2.name);
       
}
       }