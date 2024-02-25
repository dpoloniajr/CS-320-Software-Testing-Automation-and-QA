package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {
    
	@Test
	void testContactConstructor() {
		Contact Contact = new Contact("1002", "Domingo", "Polonia", "6693414311", "31 Audrey Ln");
		assertTrue(Contact.getContactId().equals("1002"));
		assertTrue(Contact.getFirstName().equals("Domingo"));
		assertTrue(Contact.getLastName().equals("Polonia"));
		assertTrue(Contact.getPhone().equals("6693414311"));
		assertTrue(Contact.getAddress().equals("31 Audrey Ln"));
	}
	
	@Test
	void testContactIdLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("27685940321" , "Domingo", "Polonia", "6693414311", "31 Audrey Ln");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null , "Domingo", "Polonia", "6693414311", "31 Audrey Ln");
		});
	}
	
	@Test
	void testFirstNameLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingonius", "Polonia", "6693414311", "31 Audrey Ln");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , null, "Polonia", "6693414311", "31 Audrey Ln");
		});
	}
	
	@Test
	void testLastNameLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonianemus", "6693414311", "31 Audrey Ln");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", null, "6693414311", "31 Audrey Ln");
		});
	}
	
	@Test
	void testPhoneLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonia", "66934143111", "31 Audrey Ln");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonia", "669341431", "31 Audrey Ln");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonia", null, "31 Audrey Ln");
		});
	}
	
	@Test
	void testAdressLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonia", "6693414311", "318456 West Audrey Ln Charlotte, MA");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1231" , "Domingo", "Polonia", "6693414311", null);
		});
	}
	
	@Test
	void testMutatorMethods() {
		Contact Contact = new Contact("1002", "Domingo", "Polonia", "6693414311", "31 Audrey Ln");
		Contact.setContactId("1345");
		Contact.setFirstName("Kareen");
		Contact.setLastName("Dolson");
		Contact.setPhone("9783428934");
		Contact.setAddress("46 Storrow Ln Burton, MA 01251");
		assertTrue(Contact.getContactId().equals("1345"));
		assertTrue(Contact.getFirstName().equals("Kareen"));
		assertTrue(Contact.getLastName().equals("Dolson"));
		assertTrue(Contact.getPhone().equals("9783428934"));
		assertTrue(Contact.getAddress().equals("46 Storrow Ln Burton, MA 01251"));
	}

}
