
public class Car {
	public int yearModel;
	public String make;
	public int speed;
	
	//Makes car speed bigger
	public void accelerate() {
		this.speed += 5;
	}
	
	//Makes car speed smaller
	public void brake() {
		this.speed -= 5;
	}
	
	//Checks to see if the cars are equal
	public boolean equals(Car c) {
		if((this.make.equals(c.make)) && (this.yearModel == c.yearModel))
			return true;
		return false;
	}
	
	//Returns properties of car as a string
	public String toString() {
		return ("Make: " + make + " Year: " + yearModel + " Speed: " + speed);
	}
}
