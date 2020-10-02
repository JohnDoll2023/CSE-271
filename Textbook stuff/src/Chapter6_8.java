import java.util.ArrayList;

public class Chapter6_8 {
	public static void main(String [] args) {
		ArrayList<String> words = new ArrayList<String>();
	      words.add("Mary");
	      words.add("had");
	      words.add("a");
	      words.add("little");
	      words.add("lamb");
	      words.add("its");
	      words.add("fleece");
	      words.add("was");
	      words.add("white");
	      words.add("as");
	      words.add("snow");

	      System.out.println(ArrayListUtil.wordsOfLength(words, 3));
	      System.out.println("Expected: [had, its, was]");
	      System.out.println(ArrayListUtil.wordsOfLength(words, 6));
	      System.out.println("Expected: [little, fleece]");
	      System.out.println(ArrayListUtil.wordsOfLength(words, 7));
	      System.out.println("Expected: []");
	      // Check that words hasn't been changed
	      System.out.println(words);
	      System.out.println("Expected: [Mary, had, a, little, lamb, its, fleece, was, white, as, snow]");
	   }
	

	public static class ArrayListUtil {
		public static ArrayList<String> wordsOfLength(ArrayList<String> w, int x) {
			ArrayList<String> a = new ArrayList<String> ();
			for(int i = 0; i <= w.size() - 1; i++) {
				if(w.get(i).length() == x) {
					a.add(w.get(i));
				}
			}
			return a;
		}
	}
}
