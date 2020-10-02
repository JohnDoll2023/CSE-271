/**
 * Author: John Doll
 * Date: February 17, 2020
 * CSE 271 Section A
 * This class is for car objects
 */
public class Car {
	private String owner;
	private String make;
	private String model;
	private int yearModel;
	private double fuelLevel;
	private int speed;

	/**
	 * 
	 */
	public Car() {
		this("", "", "", 0, 0.0, 0);
	}
	
	/**
	 * This sets the owner, make, model, and year model of the car
	 * @param owner This is the owner of the car
	 * @param make This is the make of the car
	 * @param model This is the model of the car
	 * @param yearModel This is the year model of the car
	 */
	public Car(String owner, String make, String model, int yearModel) {
		setOwner(owner);
		setMake(make);
		setModel(model);
		setYearModel(yearModel);
	}
	
	/**
	 * This sets the owner, make, model, year model, and fuel level of the car
	 * @param owner This is the owner of the car
	 * @param make This is the make of the car
	 * @param model This is the model of the car
	 * @param yearModel This is the year model of the car
	 * @param fuelLevel This is the fuel level of the car
	 */
	public Car(String owner, String make, String model, int yearModel, double fuelLevel) {
		setOwner(owner);
		setMake(make);
		setModel(model);
		setYearModel(yearModel);
		setFuelLevel(fuelLevel);
	}
	/**
	 * This sets the owner, make, model, year model, fuel level, and speed of the car
	 * @param owner This is the owner of the car
	 * @param make This is the make of the car
	 * @param model This is the model of the car
	 * @param yearModel This is the year model of the car
	 * @param fuelLevel This is the fuel level of the car
	 * @param speed This is the speed of the car
	 */
	public Car(String owner, String make, String model, int yearModel, double fuelLevel, int speed) {
		setOwner(owner);
		setMake(make);
		setModel(model);
		setYearModel(yearModel);
		setFuelLevel(fuelLevel);
		setSpeed(speed);
	}
	/**
	 * This creates a copy of car1
	 * @param car1 This is car1 and all of its properties
	 */
	public Car(Car car1) {
		setOwner(car1.owner);
		setMake(car1.make);
		setModel(car1.model);
		setYearModel(car1.yearModel);
		setFuelLevel(car1.fuelLevel);
		setSpeed(car1.speed);
		
	}
	/**
	 * This returns the owner of the car
	 * @return The owner of the car
	 */
	public String getOwner() {
		return owner;
	}
	
	/**
	 * This changes the owner of the car
	 * @param owner This is the new owner of the car
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * This returns the make of the car
	 * @return The make of the car
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * This changes the make of the car
	 * @param make This is the new make of the car
	 */
	public void setMake(String make) {
		this.make = make;
	}
	
	/**
	 * This returns the model of the car
	 * @return The model of the car
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * This changes the model of the car
	 * @param model This is the new model of the car
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
	/**
	 * This returns the year model of the car
	 * @return The year model of the car
	 */
	public int getYearModel() {
		return yearModel;
	}
	
	/**
	 * This changes the year model of the car
	 * @param yearModel This is the new year model of the car
	 */
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	/**
	 * This returns the fuel level of the car
	 * @return The fuel level of the car
	 */
	public double getFuelLevel() {
		return fuelLevel;
	}
	
	/**
	 * This changes the fuel level of the car, within the limits of the fuel level boundaries
	 * @param fuelLevel The new fuel level of the car
	 */
	public void setFuelLevel(double fuelLevel) {
		if (fuelLevel < 0) 
			throw new IllegalArgumentException("Fuel Level cannot be less than 0.");
		else if(fuelLevel > 10)
			throw new IllegalArgumentException("Fuel Level cannot be more than 10.");
		else
			this.fuelLevel = fuelLevel;
	}
	
	/**
	 * This returns the speed of the car
	 * @return The speed of the car
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * This changes the speed of the car, within the limits of the speed boundaries
	 * @param speed The new speed of the car
	 */
	public void setSpeed(int speed) {
		if (speed < 0) {
			throw new IllegalArgumentException("Speed cannot be less than zero.");
		}
		else if(speed > 200)
			throw new IllegalArgumentException("Speed cannot be more than 200.");
		else
			this.speed = speed;
	}
	
	/**
	 * This displays all the properties of the car
	 */
	public String toString() {
		return ("Owner: " + this.owner + ", Make: " +  this.make + ", Model: " + this.model + ", Year Model: " + this.yearModel + ", Fuel Level: " + this.fuelLevel + ", Speed: " + this.speed);
	}
	
	/**
	 * This makes the car's speed increase if the fuel and speed are within the proper boundaries
	 * @return
	 */
	public boolean accelerate() {
		if(this.fuelLevel >= 0.5 && this.speed >= 195 && this.speed < 200) {
			this.speed = 200;
			this.fuelLevel -= 0.5;
		}
		else if(this.fuelLevel >= 0.5 && this.speed <= 195) {
			this.speed += 5;
			this.fuelLevel -= 0.5;
			return true;
		}
		return false;
	}
	
	/**
	 * This makes the car's speed decrease if the speed is within the proper boundaries.
	 */
	public void brake() {
		if(getSpeed() < 5 && getSpeed() > 0) {
			speed = 0;
		}
		else if (getSpeed() == 0)
			throw new IllegalArgumentException("Speed cannot be less than zero.");
		else
			this.speed -= 5;
	}
	
	/**
	 * Checks to see if the fuel level is 0.
	 * @return true if the fuel level is 0 and false otherwise
	 */
	public boolean isGasTankEmpty() {
		if(getFuelLevel() == 0) 
			return true;
		return false;
	}
	
	/**
	 * Checks to see if the cars being compared have the same owner
	 * @param car passes through car properties
	 * @return true if the owners are the same and false otherwise
	 */
	public boolean sameOwner(Car car) {
		if(getOwner() == car.owner)
			return true;
		return false;
	}
	
	/**
	 * Checks to see if the cars being compared have the same make, model, and year model.
	 * @param car passes through car's properties
	 * @return true if all 3 values are equal, and false otherwise
	 */
	public boolean equals(Car car) {
		if(getMake().equals(car.make) && getModel().equals(car.model) && getYearModel() == car.yearModel)
			return true;
		return false;
	}
}