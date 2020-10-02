/**
 * Author: John Doll
 * Date: February 17, 2020
 * CSE 271 Section A
 */
public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("John","Honda", "Pilot", 2012, 1, 50);
		c1.setSpeed(3);
		System.out.println(c1.getSpeed());
		c1.accelerate();
		c1.accelerate();
		System.out.println(c1.getFuelLevel());
		System.out.println(c1.getSpeed());
		System.out.println(c1.toString());
		System.out.println(c1.isGasTankEmpty());
		System.out.println(c1.accelerate());
		c1.brake();
		Car c2 = new Car(c1);
		System.out.println(c1.sameOwner(c2));
		c1.brake();
		c2.setOwner("Nathan");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c2.accelerate());
		System.out.println(c1.sameOwner(c2));
		System.out.println(c1.equals(c2));
		c1.setMake("Audi");
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c2.setModel("Accord");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.getYearModel());
		c1.setYearModel(2020);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		c1.setFuelLevel(10.0);
		c1.setFuelLevel(0.0);
		c1.setSpeed(0);
		//Will throw and exception
		//c1.brake();
		c1.setSpeed(1);
		c1.brake();
		c1.setSpeed(200);
		c1.setSpeed(196);
		c1.setFuelLevel(5);
		c1.accelerate();
		System.out.println(c1.toString());
		System.out.println(c2.getMake());
		System.out.println(c2.getModel());
		System.out.println(c2.getOwner());
		//These will throw exceptions
		//c1.setFuelLevel(15); 
		//c1.setFuelLevel(-1);
		//c2.setSpeed(201); 
		//c2.setSpeed(-1);
		
	}

}
