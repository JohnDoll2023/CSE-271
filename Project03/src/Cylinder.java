
public class Cylinder extends Circle implements Volume{
	double height;

	/**
	 * Creates a new cylinder object
	 * @param height the height of the cylinder object
	 * @param radius the radius of the cylinder object 
	 * @param name the name of the cylinder object
	 */
	public Cylinder(double height, double radius, String name) {
		super(radius, name);
		this.height = height;
	}
	
	/**
	 * Returns the volume of the cylinder object
	 */
	public double getVolume() {
		return this.getHeight()*Math.PI*this.getRadius()*this.getRadius();
	}
	
	/**
	 * Checks to see if two cylinder objects are equal
	 * @param c1 the cylinder being checked
	 * @return true if the cylinders have equal height and radius, and false otherwise
	 */
	public boolean equals(Cylinder c1) {
		if(this.getHeight() == c1.getHeight() && this.getRadius() == c1.getRadius())
			return true;
		return false;
	}
	
	/**
	 * Returns a string with the data about the cylinder
	 */
	public String toString() {
		return this.getName() + " [Radius: " + this.getRadius() + " Height: " + this.getHeight() + "]";
	}
	
	/**
	 * Returns the height of the cylinder object
	 * @return the height of the cylinder object
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Makes a new height for the cylinder object
	 * @param height the new height of the cylinder object
	 */
	public void setHeight(double height) {
		this.height = height;
	}
}
