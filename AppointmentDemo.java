package appointmentSystem;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class AppointmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the date(yyyy-mm-dd): ");
		String date = input.nextLine();
		LocalDate d1 = LocalDate.parse(date);
		
		Appointment[] appointments;
		appointments = new Appointment[3];
		
		appointments[0] = new DailyApt("Study math");
		appointments[1] = new MonthlyApt("Dentist", 10);
		appointments[2] = new OneTime("UCL Final", 23, 05, 2002);
		
		System.out.println("You have the following appointments on " + date + ": ");
		
		for(int i = 0; i < appointments.length; i++) {
			if(appointments[i].occursOn(d1.get(ChronoField.YEAR), d1.get(ChronoField.MONTH_OF_YEAR), d1.get(ChronoField.DAY_OF_MONTH))) {
				System.out.println(appointments[i].getDescription());
			}
		}
	}
}
