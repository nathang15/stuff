package appointmentSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OneTimeTest {
	private OneTime a3;
	@Before
	public void setUp() throws Exception {
		a3 = new OneTime("UCL Championship", 19, 5, 2025);
	}
	@Test
	public void test() {
		assertEquals(true, a3.occursOn(2025, 5, 19));
		assertEquals(false, a3.occursOn(1999, 5, 19));
		assertEquals(false, a3.occursOn(2025, 8, 19));
		assertEquals(false, a3.occursOn(20205, 5, 20));
		assertEquals(19, a3.getDay());
		assertEquals(2025, a3.getYear());
		assertEquals(5, a3.getMonth());
		assertEquals("UCL Championship; Type: One-time.", a3.getDescription());
		a3.setDescription("Bowling tournament");
		assertEquals("Bowling tournament; Type: One-time.", a3.getDescription());
		assertEquals("Bowling tournament", a3.toString());
		a3.setDay(15);
		assertEquals(15, a3.getDay());
		a3.setMonth(7);
		assertEquals(7, a3.getMonth());
		a3.setYear(2018);
		assertEquals(2018, a3.getYear());
	}

}
