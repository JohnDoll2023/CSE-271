import java.io.*;
public class RAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   RandomAccessFile rnd = null; 
	try
	{
		rnd = new RandomAccessFile("output.dat","rw");
		
		rnd.writeBytes("Hello World");
		rnd.seek(0);
		rnd.writeBytes("Welcome");
	}
	catch (Exception e)
	{
		e.printStackTrace();
		System.out.println("problem");
	}
	

		


}
}
