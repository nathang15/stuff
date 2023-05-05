package appointmentSystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DailyAptTest {
	private DailyApt a1;
	@Before
	public void setUp() throws Exception {
		a1 = new DailyApt("Brushing teeth");
	}
	@Test
	public void test() {
		assertEquals(true, a1.occursOn(2023, 12, 30));
		assertEquals(true, a1.occursOn(1231232, 23, 10));
		assertEquals("Brushing teeth; Type: Daily.", a1.getDescription());
		assertEquals("Brushing teeth", a1.toString());
		a1.setDescription("Math");
		//assertEquals("Math", a1.getDescription());
		assertEquals("Math", a1.toString());
		
	}

}
