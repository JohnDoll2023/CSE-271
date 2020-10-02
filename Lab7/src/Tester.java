
public class Tester {
	public static void main(String [] args) {
		
		//Rectangle tests
		Rectangle r1 = new Rectangle(3,4);
		Rectangle r2 = new Rectangle(5,6);
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println(r1.equals(r2));
		Rectangle r3 = new Rectangle(3,4);
		System.out.println(r1.equals(r3));
		Triangle t0 = new Triangle(3,4);
		System.out.println(r1.equals(t0));
		Rectangle r4 = null;
		System.out.println(r1.equals(r4));
		
		//Triangle tests
		Triangle t1 = new Triangle(3,4);
		Triangle t2 = new Triangle(5,6);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t1.getArea());
		System.out.println(t2.getArea());
		System.out.println(t1.equals(t2));
		Triangle t3 = new Triangle(3,4);
		System.out.println(t1.equals(t3));
		Rectangle r0 = new Rectangle(3,4);
		System.out.println(t1.equals(r0));
		Triangle t4 = null;
		System.out.println(t1.equals(t4));
	}

}
