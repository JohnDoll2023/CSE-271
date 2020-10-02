
public class Square extends Shape implements Area {
	private double side;

	/**
	 * Creates a square object
	 * @param side the side of the square
	 * @param name the name of the square
	 */
	public Square(double side, String name) {
		super(name);
		this.side = side;
	}
	
	/**
	 * Returns the area of the square
	 */
	public double getArea() {
		return this.getSide()*this.getSide();
	}
	
	/**
	 * Returns the name of the square
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Checks to see if two square objects are equal
	 * @param s1 the square to be checked
	 * @return true if the squares have the same sidelength and false otherwise
	 */
	public boolean equals(Square s1) {
		if(this.getSide() == s1.getSide()) 
			return true;
		return false;
	}
	
	/**
	 * Returns the data of the square as a string
	 */
	public String toString() {
		return this.getName() + " [Side: " + this.getSide() + "]";
	}

	/**
	 * Returns the length of the side
	 * @return the length of the side
	 */
	public double getSide() {
		return this.side;
	}

	/**
	 * Creates a new value for the length of the side of the square
	 * @param side the new side length
	 */
	public void setSide(double side) {
		this.side = side;
	}
}
