
public class Glome extends Sphere implements Volume{
	
	/**
	 * Creates a glome object
	 * @param radius the radius of the glome
	 * @param name the name of the glome
	 */
	public Glome(double radius, String name) {
		super(radius, name);
	}
	
	/**
	 * Returns the volume of the glome
	 */
	public double getVolume() {
		return .5*Math.PI*Math.PI*this.getRadius()*this.getRadius()*this.getRadius()*this.getRadius();
	}
	
	/**
	 * Returns the data of the glome as a string
	 */
	public String toString() {
		return this.getName() + " [Radius: " + this.getRadius() + "]";
	}
}
