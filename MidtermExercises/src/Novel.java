
public class Novel extends Book {
	private String type;
	private double percent_markup;
	
	public Novel(String title, double base_price, String type, double percent_markup) {
		super(title, base_price);
		setType(type);
		setPercent_markup(percent_markup);
	}
	
	public double cost() {
		return getBase_price()*((100 + percent_markup)/100);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPercent_markup() {
		return percent_markup;
	}

	public void setPercent_markup(double percent_markup) {
		this.percent_markup = percent_markup;
	}
	
	public String toString() {
		return "Novel Title: " + getTitle() + " Base price: " + getBase_price() + " Type: " + getType() + " Percent markup: " + percent_markup; 
	}
	
	public boolean equals(Novel n1) {
		if(this.getType().equals(n1.getType())) {
			if(this.getTitle().equals(n1.getTitle()))
				return true;
		}
		return false;
	}
}
