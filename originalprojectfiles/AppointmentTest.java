package appointment;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppointmentTest {

	Date d1 = new Date(4448547325000L);

	@Test
	void testApptConstructor() {
		Appointment appt = new Appointment("1002", d1, "Move the desk to the corner");
		assertTrue(appt.getApptId().equals("1002"));
		assertTrue(appt.getApptDate().equals(d1));
		assertTrue(appt.getDesc().equals("Move the desk to the corner"));
	}

	@Test
	void testApptIdLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("27685940321", d1, "Move the desk to the corner");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, d1, "Move the desk to the corner");
		});
	}

	@Test
	void testApptDateAndNotNull() {
		Date date = new Date(1634788800000L);
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1231", date, "Move the desk to the corner");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1231", null, "Move the desk to the corner");
		});
	}

	@Test
	void testDescriptionLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1231", d1,
					"Move the desk to the corner Polonianemus-Pandaemoniusmaximoonius correctimonius");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("1231", d1, null);
		});
	}

	@Test
	void testMutatorMethods() {
		Date test = new Date(1634788800000L);
		Appointment appt = new Appointment("1002", d1, "Polonia");
		appt.setApptId("1345");
		appt.setApptDate(test);
		appt.setDesc("Pack up house to move.");
		assertTrue(appt.getApptId().equals("1345"));
		assertTrue(appt.getApptDate().equals(test));
		assertTrue(appt.getDesc().equals("Pack up house to move."));
	}

}
