package appointment;

import java.util.Date;

public class Appointment {

	/*
	 * We initialize our variables to be used in the constructor and
	 * mutator/accessor methods
	 */
	private String apptId;
	private Date apptDate;
	private String desc;

	/*
	 * Our constructor with its parameters and conditionals set to the
	 * specifications in the requirements doc. Then assigning the values if the
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
