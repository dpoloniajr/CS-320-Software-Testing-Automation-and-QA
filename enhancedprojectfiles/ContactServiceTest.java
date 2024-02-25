/*
 * File: Contact Service Test Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class contains unit tests for the Contact Service class file.
 */

package contactService;
import contact.Contact;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
    @Disabled
	@Test
	void testAddContactAndUniqueId() {
		Contact Contact1 = new Contact("1243", "Marlin", "Mace", "6318789934", "87 Mori Ln Sherwood, MA");
		ContactService serv = new ContactService();
	    assertTrue(serv.addContact(Contact1).containsKey(1002));
		
	}
    @Disabled
	@Test
	void testDeleteContact() {
		Contact con = new Contact("1000", "Shirley", "Mace", "6318789934", "87 Mori Ln Sherwood, MA");
	    ContactService ser = new ContactService();
	    ser.addContact(con);
	    //serv.deleteContact("1000");
	    assertFalse(ser.deleteContact("1000").containsKey(1001));
	
	}
	

	@Test
	void testUpdateContact() {
		Contact contact = new Contact("1000", "Shirley", "Mace", "6318789934", "87 Mori Ln Sherwood, MA");
	    ContactService ser = new ContactService();
	    ser.addContact(contact);
	    ser.updateContact("1000", "Shirley", "Devons", "6318789934", "87 Mori Ln Sherwood, MA");
	    assertEquals(true, ser.callMap().get(contact).getLastName() == "Devons");
	}

}
