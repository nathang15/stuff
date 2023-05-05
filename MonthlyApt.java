package appointmentSystem;

public class MonthlyApt extends Appointment {
	private int date;
	
	/**
	 * set the description and the date that the appointment occurs monthly
	 * @param description the description
	 * @param date the date
	 */
	public MonthlyApt(String description, int date) {
		super(description);
		this.date = date;
	}
	
	/**
	 * 
	 * @return the date that the appointment occurs on monthly
	 */
	public int getDay() {
		return date;
	}
	/**
	 * check if the daily appointment is on the input date or not. Return true if it is, false if not 
	 */
	@Override
	public boolean occursOn(int checkedYear, int checkedMonth, int checkedDate) {
		if (checkedDate == date) {
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 * get the appointment description and the type of the appointment, which is monthly
	 */
	@Override
	public String getDescription() {
		return toString() + "; Type: Monthly." ;
	}
	/**
	 * set a new date for the monthly appointment
	 * @param day new date for the appointment
	 */
	public void setDay(int day) {
		date = day;
	}
	
}
