
public class Mammal {
	String name;
	int age;
	
	public Mammal() {
		this.name = null;
		this.age = 0;
	}
	
	public Mammal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Mammal m) {
		if(this.age == m.age) {
			if(this.name.equals(m.name))
				return true;
		}
		return false;
	}
	
	public String toString() {
		return "My name is " + this.name + " and I am " + this.age + " years old. I belong to the class mammalia in the animal kingdom.";
	}
}
