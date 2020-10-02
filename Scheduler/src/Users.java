import java.util.ArrayList;

public class Users {
	private ArrayList<People> identity = new ArrayList<> ();
	private String username;
	
	public Users(String username, ArrayList<People> p1) {
		this.username = username;
		this.identity = p1;
	}

	public ArrayList<People> getIdentity() {
		return identity;
	}

	public void setIdentity(ArrayList<People> identity) {
		this.identity = identity;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}