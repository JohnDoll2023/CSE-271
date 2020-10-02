
public class Circle extends Shape implements Area {
	private double radius;
	
	/**
	 * Creates a circle object
	 * @param radius the radius of the Circle
	 * @param name the name of the Circle
	 */
	public Circle(double radius, String name) {
		super(name);
		this.radius = radius;
	}
	/**
	 * Returns the area of the circle
	 */
	public double getArea() {
		return Math.PI*Math.pow(this.getRadius(), 2);
	}

	/**
	 * returns the name of the Circle
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Checks if two circles are equal
	 * @param c1 the circle being compared to
	 * @return true if the circles are equal and false otherwise
	 */
	public boolean equals(Circle c1) {
		if(this.getRadius() == c1.getRadius())
			return true;
		return false;
	}
	
	/**
	 * Returns the data about the circle in a string
	 */
	public String toString() {
		return this.getName() + " [Radius: " + this.getRadius() + "]";
	}

	/**
	 * Returns the radius of the circle
	 * @return the radius of the circle
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Sets the radius of the circle
	 * @param radius the new radius of the circle
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
