
public abstract class Shape {
	String name;
	public abstract String getName();
	/**
	 * Creates a shape object with a name
	 * @param name the name of the shape
	 */
	public Shape(String name) {
		this.name = name;
	}
}
