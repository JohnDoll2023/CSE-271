
public class Textbook extends Book {
	private String field;
	private double percentage_discount;
	
	public Textbook(String title, double base_price, String field, double percentage_discount) {
		super(title, base_price);
		setField(field);
		setPercentage_discount(percentage_discount);
	}
	
	public double cost() {
		return getBase_price()*((100-percentage_discount)/100);
	}
	
	public String toString() {
		return "Textbook Title: " + getTitle() + " Base price: " + getBase_price() + " Field: " + getField() + " Discount: " + percentage_discount; 
	}
	
	public boolean equals(Textbook t1) {
		if(this.field.equals(t1.field)) {
			if(this.getTitle().equals(t1.getTitle())) 
				return true;
		}
		return false;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public double getPercentage_discount() {
		return percentage_discount;
	}

	public void setPercentage_discount(double percentage_discount) {
		this.percentage_discount = percentage_discount;
	}
}
