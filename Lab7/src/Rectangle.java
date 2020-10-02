/**
 * 
 * @author johndoll
 * CSE 271 Section A
 * 3-9-20
 */
public class Rectangle implements Shape{
	private double length;
	private double width;
	
	/**
	 * Rectangle constructor
	 * @param length the length of the rectangle
	 * @param width the width of the rectangle
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Calculates the area of the rectangle
	 */
	public double getArea() {
		return this.width*this.length;
	}
	
	/**
	 * Compares two objects to see if they are equal
	 */
	public boolean equals(Object otherObject) {
		if(otherObject !=  null) {
			if(otherObject instanceof Rectangle) {
				if(this.width == ((Rectangle) otherObject).width) {
					if(this.length == ((Rectangle) otherObject).length)
						return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Returns the Rectangle object as a string
	 */
	public String toString() {
		return "Rectangle [length=" + this.length + ", width=" + this.width + "]";
	}
}