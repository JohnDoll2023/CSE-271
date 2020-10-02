
public class Carnivora extends Mammal {
	String type;
	boolean isWild;
	
	public Carnivora (String name, int age, String type, boolean isWild) {
		super(name, age);
		this.type = type;
		this.isWild = isWild;
	}
	
	public Carnivora(Carnivora c) {
		this.name = c.name;
		this.age = c.age;
		this.type = c.type;
		this.isWild = c.isWild;
	}
	
	public String toString () {
		if(this.isWild) 
			return super.toString() + " I belong to the" + this.type + " family and a wild member.";
		else if(!this.isWild)
			return super.toString() + " I belong to the" + this.type + " family";
		return null;		
	}

}
