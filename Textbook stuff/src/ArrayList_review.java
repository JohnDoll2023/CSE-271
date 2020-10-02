import java.util.ArrayList;

public class ArrayList_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
	      words.add("how");
	      words.add("much");
	      words.add("wood");
	      words.add("would");
	      words.add("a");
	      words.add("wood");
	      words.add("chuck");
	      words.add("chuck");
	      words.add("if");
	      words.add("a");
	      words.add("wood");
	      words.add("chuck");
	      words.add("could");
	      words.add("chuck");
	      words.add("wood");
	      System.out.println(ArrayListUtil.findAll(words, "wood"));
	      System.out.println("Expected: [2, 5, 10, 14]");
	      System.out.println(ArrayListUtil.findAll(words, "a"));
	      System.out.println("Expected: [4, 9]");
	      System.out.println(ArrayListUtil.findAll(words, "the"));
	      System.out.println("Expected: []");
	}

	public static class ArrayListUtil {
		public static ArrayList<Integer> findAll(ArrayList<String> w, String s) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i = 0; i <= w.size() - 1; i++) {
				if(w.get(i).equals(s)) {
					a.add(i);
				}
			}
			return a;
		}
	}
}

