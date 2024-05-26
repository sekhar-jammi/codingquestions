package com.abstractclass;

public class Employee extends Company{
	   void printInfo() {
		   String name="sekhar";
		   int age=26;
		   double salary=30000;
		   System.out.println(name);
		   System.out.println(age);
		   System.out.println(salary);
	   } 
	   
	   public static void main(String[]args) {
		       Employee e=new Employee();
		       e.printInfo();
	   }

}
