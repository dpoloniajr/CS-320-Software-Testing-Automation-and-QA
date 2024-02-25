/*
 * File: Appointment Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class uses in-memory data structures to support storing contacts.
 * The Appointment Class requirements are: 
 * 1. The appointment object shall have a required unique contact ID String that cannot be longer than 10 characters.
 * 2. The appointment ID shall not be null and shall not be updatable.
 * 3. The appointment object shall have a required appointment Date field.
 * 4. The appointmentDate field cannot be in the past. 
 * 5. The appointmentDate field shall not be null. 
 * Note: Use java.util.Date for the appointmentDate field and use before(new Date()) to check if the date is in the past. 
 * 6. The appointment object shall have a required description String field that cannot be longer than 50 characters. 
 * 7. The description field shall not be null. 
 */

package appointment;

import java.util.Date;

public class Appointment {

	/*
	 * Initialize the variable to be used in the constructor
	 * and mutator/accessor methods
	 */
	private String apptId;
	private Date apptDate;
	private String desc;

	/*
	 * The constructor with its parameters and conditionals set to the
	 * specifications in the requirements. Then assigning the values if the
	 * conditional statements pass, otherwise it throws an error.
	 */

	public Appointment(String id, Date date, String desc) {
		
		final Date date2 = new Date();

		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}

		if (date == null || date.before(date2)) {
			throw new IllegalArgumentException("Invalid Appointment Date");
		}

		if (desc == null || desc.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}

		this.apptId = id;
		this.apptDate = date;
		this.desc = desc;

	}

	// Accessor method for the appointment id variable
	public String getApptId() {
		return apptId;
	}

	// Mutator method for the appointment id variable
	public void setApptId(String apptId) {
		this.apptId = apptId;
	}

	// Accessor method for the appointment apptDate variable
	public Date getApptDate() {
		return apptDate;
	}

	// Mutator method for the appointment apptDate variable
	public void setApptDate(Date date) {
		this.apptDate = date;
	}

	// Accessor method for the desc variable
	public String getDesc() {
		return desc;
	}

	// Mutator method for the desc variable
	public void setDesc(String desc) {
		this.desc = desc;
	}

}
