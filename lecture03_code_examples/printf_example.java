import java.io.File;
import java.util.Scanner;

public class printf_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Scanner cin=null;
	  try
       {
		 cin = new Scanner(new File("data.txt"));
		
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       
	  while (cin.hasNext())
	  {
       String line = cin.nextLine();
       String [] tokens = line.split(",");

       System.out.printf("%-20s %-20s %08.4f\n", tokens[0], tokens[1], Float.parseFloat(tokens[3]));
	  }
       
	}

}
