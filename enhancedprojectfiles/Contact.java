package contact;

public class Contact {

	/*
	 * We initialize our variables to be used in the constructor and 
	 * mutator/accessor methods
	 */
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	/*
	 * Our constructor with its parameters and conditionals set to the 
	 * specifications in the requirements doc. Then assigning the values 
	 * if the conditional statements pass.
	 */
	
	public Contact(String id, String fName, String lName, String phone, String loc) {

		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}

		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}

		if (lName == null || lName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}

		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}

		if (loc == null || loc.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactId = id;
		this.firstName = fName;
		this.lastName = lName;
		this.phone = phone;
		this.address = loc;

	}

	//Accessor method for the contact id variable
	public String getContactId() {
		return contactId;
	}
	//Mutator method for the contact id variable
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	//Accessor method for the first name variable
	public String getFirstName() {
		return firstName;
	}
	
	//Mutator method for the first name variable
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Accessor method for the last name variable
	public String getLastName() {
		return lastName;
	}
	
	//Mutator method for the last name variable
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Accessor method for the phone variable
	public String getPhone() {
		return phone;
	}
	
	//Mutator method for the phone variable
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//Accesor method for the address variable
	public String getAddress() {
		return address;
	}
	//Mutator method for the address variable
	public void setAddress(String address) {
		this.address = address;
	}
}
