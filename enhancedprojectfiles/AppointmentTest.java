/*
 * File: Appointment Test Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class contains unit tests for the Appointment class file.
 */

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
