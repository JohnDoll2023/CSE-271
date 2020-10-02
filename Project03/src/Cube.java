
public class Cube extends Square implements Volume{
	
	/**
	 * Creates a new cube object
	 * @param side the side of the cube
	 * @param name the name of the cube
	 */
	public Cube(double side, String name) {
		super(side, name);
	}
	
	/**
	 * Returns the volume of the cube
	 */
	public double getVolume() {
		return this.getSide()*this.getSide()*this.getSide();
	}
	
	/**
	 * Returns data about the object as a string
	 * @return data about the object as a string
	 */
	public String toString() {
		return this.getName() + " [Side: " + this.getSide() + "]";
	}
}
