package appointmentSystem;

public class DailyApt extends Appointment{
	
	/**
	 * set a description for the appointment
	 * @param description the appointment description
	 */
	public DailyApt(String description) {
		super(description);
	}		
	/**
	 * check if the daily appointment is on the input date or not. Return true if it is, false if not 
	 */
	@Override
	public boolean occursOn(int checkedYear, int checkedMonth, int checkedDate) {
		return true;
	}
	/**
	 * get the appointment description and the type of the appointment, which is daily
	 */
	@Override
	public String getDescription() {
		return toString() + "; Type: Daily." ;
	}
}
