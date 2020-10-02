
public class Book {
	private String title;
	private double base_price;
	
	public Book() {
		this("",0);
	}
	
	public Book(String title, double base_price) {
		setTitle(title);
		setBase_price(base_price);
	}
	
	public Book(Book b1) {
		this.title = b1.title;
		this.base_price = b1.base_price;
	}
	
	public Book clone() {
		return new Book(this);
	}
	public String toString() {
		return "Book Title: " + this.title + " Base price: " + base_price;
	}
	
	public boolean equals(Book b1) {
		if(this.title.equals(b1.title)) {
			if(this.base_price == b1.base_price)
				return true;
		}
		return false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getBase_price() {
		return base_price;
	}

	public void setBase_price(double base_price) {
		this.base_price = base_price;
	}
	
	public int compareTo(Object o1) {
		if(o1 instanceof Book) {
			if(o1 != null) {
				for(int i = 0; i < 100; i++) {
					if(this.getTitle().charAt(i) != ((Book) o1).getTitle().charAt(i)) {
						if(this.getTitle().charAt(i) > ((Book) o1).getTitle().charAt(i)) {
							return this.getTitle().charAt(i) - ((Book) o1).getTitle().charAt(i);
					}
						else
							return ((Book) o1).getTitle().charAt(i) - this.getTitle().charAt(i);
				}
					return 0;
			}
		}
	}
		throw new NullPointerException();
}
}
