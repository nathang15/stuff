package appointmentSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonthlyAptTest {
	private MonthlyApt a2;
	@Before
	public void setUp() throws Exception {
		a2 = new MonthlyApt("Math exams", 20);
	}
	@Test
	public void test() {
		assertEquals(true, a2.occursOn(2023, 12, 20));
		assertEquals(false, a2.occursOn(1999, 8, 10));
		assertEquals(20, a2.getDay());
		assertEquals("Math exams; Type: Monthly.", a2.getDescription());
		assertEquals("Math exams", a2.toString());
		a2.setDescription("Soccer games");
		assertEquals("Soccer games; Type: Monthly.", a2.getDescription());
		assertEquals("Soccer games", a2.toString());
		a2.setDay(12);
		assertEquals(12, a2.getDay());
	}

}
