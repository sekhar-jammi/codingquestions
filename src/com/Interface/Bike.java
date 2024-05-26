package com.Interface;

public class Bike implements Vehicle{
    int speed;
    int gear;
    
    //To change gear..
	@Override
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
		System.out.println("bike present states are:");
		System.out.println("speed:"+speed+"gear:"+gear);
	}

}
