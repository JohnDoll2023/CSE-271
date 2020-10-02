import java.io.File;

public class Testfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/johndoll/CSE 271");
		String [] files = file.list();
		
		System.out.println("Listing contents of " +file.getPath());
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
