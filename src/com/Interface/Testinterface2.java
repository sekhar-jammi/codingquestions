package com.Interface;

public class Testinterface2 {
       public static void main(String[]args) {
    	   
    	      //Creating instance of bicycle..
    	      Bicycle bicycle=new Bicycle();
    	      bicycle.changeGear(3);
    	      bicycle.speedUp(3);
    	      bicycle.applyBrakes(3);
    	      
    	      bicycle.printstates();
    	      
    	      //creating instance of bike..
    	      Bike bike=new Bike();
    	      bike.changeGear(2);
    	      bike.speedUp(2);
    	      bike.applyBrakes(2);
    	      
    	      bike.printstates();
       }
}
