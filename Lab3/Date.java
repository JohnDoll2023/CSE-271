
public class Date {

	public int day;
	public String month;
	public int year;
	
	//Checks to see if dates are equal
	public boolean equals(Date date) {
		if((this.day == date.day) && (this.month.equals(date.month)) && (this.year == date.year))
			return true;
		return false;
	}
	
	//Returns dates as a string
	public String toString() {
		String thisdate = day + " " + month + " " + year;
		return thisdate;
	}
}
