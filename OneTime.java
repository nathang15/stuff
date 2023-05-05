package appointmentSystem;

public class OneTime extends MonthlyApt{
	private int month;
	private int year;
	
	/**
	 * set the description and the date and the year that the appointment occurs 
	 * @param description the description
	 * @param date the date
	 * @param year the year 
	 */
	public OneTime(String description, int date, int month, int year) {
		super(description, date);
		this.month = month;
		this.year = year;
	}
	
	/**
	 * 
	 * @return the month that the appointment occurs on 
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 
	 * @return the year that the appointment occurs on 
	 */
	public int getYear() {
		return year;
	}
	/**
	 * set new month for the appointment
	 * @param newMonth new appointment month
	 */
	public void setMonth(int newMonth) {
		month = newMonth;
	}
	/**
	 * set new year for the appointment
	 * @param newYear new appointed year
	 */
	public void setYear(int newYear) {
		year = newYear;
	}
	
	/**
	 * check for the availability of the one time appointment
	 */
	@Override
	public boolean occursOn(int checkedYear, int checkedMonth, int checkedDate) {
		if (checkedMonth == month && checkedYear == year) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * get the appointment description and the type of the appointment, which is one-time
	 */
	@Override
	public String getDescription() {
		return toString() + "; Type: One-time." ;
	}
	
}
