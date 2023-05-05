package appointmentSystem;


public abstract class Appointment {
	private String description;	
	
	public Appointment(String description) {
		this.description = description;	
	}
	/**
	 * check the availability of an appointment
	 * @param checkedYear the Year passed in
	 * @param checkedMonth the Month passed in
	 * @param checkedDate the Date passed in
	 * @return true or false whether the appointment happened or not
	 */
	abstract public boolean occursOn(int checkedYear, int checkedMonth, int checkedDate);
	
	/**
	 * get the appointment type (daily, monthly, or one-time) and the appointment description
	 * @return the type
	 */
	abstract public String getDescription();
	
//	/**
//	 * get the appointment description
//	 * 
//	 * @return the description
//	 */
//	
//	public String getDescription() {
//		return description;
//	}
	/**
	 * gives the appointment a new description
	 * @param newDescription new appointment description
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}
	/**
	 * get the appointment description object
	 */
	public String toString() {
		return description;
	}
}  