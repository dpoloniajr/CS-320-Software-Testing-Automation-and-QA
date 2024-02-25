/*
 * File: Appointment Service Test Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class contains unit tests for the Appointment Service class file.
 */

package appointmentService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentServiceTest {

	Date date = new Date(4448547325000L);

	@Test
	void testAddContactAndUniqueId() {
		AppointmentService serv = new AppointmentService();
		serv.addAppt(date, "Get teeth cleaned");
		assertTrue(serv.callMap().containsKey(1001));

	}

	@Test
	void testDeleteContact() {
		AppointmentService ser = new AppointmentService();
		ser.addAppt(date, "Get teeth cleaned");
		assertFalse(ser.deleteAppointment("1002").containsKey(1002));

	}
}
