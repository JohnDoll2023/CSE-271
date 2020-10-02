
public class Sphere extends Circle implements Volume{
	
	/**
	 * Creates a new sphere object
	 * @param radius the radius of the sphere
	 * @param name the name of the sphere
	 */
	public Sphere(double radius, String name) {
		super(radius, name);
	}
	
	/**
	 * Returns the volume of the sphere
	 */
	public double getVolume() {
		return 4*Math.PI*this.getRadius()*this.getRadius()*this.getRadius()/3;
	}
	
	/**
	 * Returns the data of the sphere object as a string
	 */
	public String toString() {
		return this.getName() + " [Radius: " + this.getRadius() + "]";
	}
}
