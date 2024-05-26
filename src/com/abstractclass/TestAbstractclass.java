package com.abstractclass;


//An AbstarctClass in java is the one which is declared with abstract keyword..
//abstract class will have abstract and non abstract methods.
//abstract class can't be instantiated..
//it can have constructors.
//if class have one abstract method it should be declared as abstract class..
//abstract keyword in java used with class and methods but not with variables.. 
public class TestAbstractclass {
       public static void main(String[]args) {
    	      Base b =new Derived();
    	      b.fun();
       }
}
