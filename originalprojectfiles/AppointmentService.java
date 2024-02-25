package appointmentService;

import java.util.Date;
//We import the java util package to use the HashMap
//We also import from the appointment package, the Appointment class to use in the data structure
import java.util.HashMap;
import java.util.Map;

import appointment.Appointment;

public class AppointmentService {
	/*
	 * uid is set as static integer for unique id. We create a appointments Map Object
	 * and use the HashMap data structure to add, and delete the Appointment Object.
	 */
	private static int uid = 1000;
	private static Map<Integer, Appointment> appointments = new HashMap<>();

	public Map<Integer, Appointment> callMap() {
		return appointments;
	}

	/*
	 * This method is used to store the Appointment Object into the Map Object
	 */
	public Appointment addAppt(Date apptId, String apptDesc) {
		uid++;
		Appointment newAppt = new Appointment(Integer.toString(uid), apptId, apptDesc);
		appointments.put(uid, newAppt);
		return newAppt;
	}

	/*
	 * We will use this method to delete an appointment object from the Map Object, by searching
	 * for the appointmentId. If the Id is found the appointment is deleted, otherwise if not
	 * found, it will be ignored.
	 */
	@SuppressWarnings("unlikely-arg-type")
	public Map<Integer, Appointment> deleteAppointment(String apptId) {

		String remove = apptId;

		appointments.entrySet().removeIf(entry -> (remove.equals(entry.getKey())));
		uid--;

		return appointments;

	}
}
