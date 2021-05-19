package Patterns;

class Vehicle{
	int max_speed = 200;
	public static void drive() {
		System.out.println("driving Vehicle");
	}
	public void race() {
		System.out.println("Driving at speed " + max_speed);
	}
}

class Car extends Vehicle{
	
	int max_speed = 180;
	public static void drive() {
		System.out.println("driving Car");
	}
	
	@Override
	public void race() {
		System.out.println("Driving at speed " + max_speed);
	}
}

public class Testing {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.drive();
		v.race();
		System.out.println(v.max_speed);
	}

}
