package Interfaces;

public interface Vehicle {
	
	// all are abstract methods 
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}

class Bicycle implements Vehicle{
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear) {
		gear = newGear;
	}
	
	// to speed up // increase speed
	@Override 
	public void speedUp(int increment) {
		speed += increment;
	}
	
	// to slow down / decrease speed
	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}
	
	public void printStates() {
		System.out.println("speed: "+ speed + " gear : "+gear);
	}
}

class Bike implements Vehicle {
	int speed;
	int gear;
	
	@Override
	public void changeGear(int newGear) {
		// TODO Auto-generated method stub
		gear = newGear;
		
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		speed += increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		speed -= decrement;
	}
	
	public void printStates() {
		System.out.println("speed: "+ speed + " gear: "+gear);
	}
}

class InterfaceDemo{
	public static void main(String [] args) {
		// creating instance of Bicycle 
		Bicycle bic = new Bicycle();
		// calling methods of Bicycle class
		bic.changeGear(3);
		bic.speedUp(40);
		bic.applyBrakes(20);
		//printing states of Bicycle
		System.out.println("Bicycle present state: ");
		bic.printStates();
		
		// creating instance of Bike
		Bike bike = new Bike();
		// calling methods of bike class
		bike.changeGear(4);
		bike.speedUp(80);
		bike.applyBrakes(40);
		//printing states of Bike 
		System.out.println("Bike present state is :: ");
		bike.printStates();
	}
}