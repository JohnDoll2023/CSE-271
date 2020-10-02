/**
 * 
 * @author johndoll
 * CSE 271 Section A
 * 3-9-20
 */
public class Triangle implements Shape{
	private double base;
	private double height;
	
	/**
	 * Triangle constructor
	 * @param base base of triangle
	 * @param height height of triangle
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	/**
	 * calculates the area of the triangle object
	 */
	public double getArea() {
		return (this.base*this.height)/2;
	}
	
	/**
	 * Compares to objects to see if they are equal
	 */
	public boolean equals(Object otherObject) {
		if(otherObject != null) {
			if (otherObject instanceof Triangle) {
				if(this.base == ((Triangle) otherObject).base) {
					if(this.height == ((Triangle) otherObject).height)
						return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns the Triangle object as a string
	 */
	public String toString() {
		return "Triangle [base=" + this.base + ",height=" + this.height + "]";
	}
}