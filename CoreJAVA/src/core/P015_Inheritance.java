package core;
class Vehicle{
	String color;
	int noOfWheels;
	String fuelTank;
	String engine;
}
class Bike extends Vehicle{
	String steering;
	String startType;
	
}
class car extends Vehicle{
	String airbag;
	String music;
	int noOfSeating;
	String driving_mode;
}
public class P015_Inheritance {
	public static void main(String[] args) {
		Bike b = new Bike();
		b.color = "black";
		car c = new car();
		c.color = "white";
	}
}
