package com.Interface;

public class Bicycle implements Vehicle{
    
	int speed;
	int gear;
	
	@Override
	//To change gear..
	public void changeGear(int newGear) {
		   gear=newGear;
		
	}

	//To increase speed..
	@Override
	public void speedUp(int increment) {
		   speed=speed+increment;
		
	}
    
	//To decrease speed..
	@Override
	public void applyBrakes(int decrement) {
		   speed=speed-decrement; 
		
	}
	public void printstates() {
		System.out.println("bicycle present states..");
		System.out.println(" speed: " +speed +" gear: " +gear);
	}
     
	}

