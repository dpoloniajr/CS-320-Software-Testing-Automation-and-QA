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
