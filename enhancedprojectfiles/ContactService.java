/*
* File: Contact Service Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class is used to handle interactions between the data and the application.
 * The Contact Service Class requirements are: 
 * 1. The contact service shall be able to add contacts with unique ID.
 * 2. The contact service shall be able to delete contacts per contactId. 
 * 3. The contact service shall be able to update contact fields per contactId. 
 * 4. The following fields are updatable: firstName, lastName, PhoneNumber, and Address.
 */

package contactService;

//Import the java util package to use the HashMap
//Import from the contact package, the Contact class to use in the data structure
import java.util.HashMap;
import java.util.Map;
import contact.Contact;

public class ContactService {
	/*uid is set as static integer for unique id. 
	* Create a contacts Map Object and use the HashMap
	* data structure to add, delete, and update 
	* the Contact Object
	*/
	private static int uid = 1000; // Static unique ID for contacts
    private static Map<Integer, Contact> contacts = new HashMap<>(); // Map to store contacts
	

	// Returns the current map of contacts
    public Map<Integer, Contact> callMap() {
        return contacts;
    }
	
	
	// Adds a Contact object to the map with a unique ID
    public boolean addContact(Contact contact) {
        if (contact == null) {
            return false; // Return false if the contact is null
        }
        contacts.put(++uid, contact); // Increment UID and then use it as a key
        return true; // Return true on successful addition
    }

    // Deletes a contact from the map based on the contact ID
    public boolean deleteContact(String contactId) {
        try {
            Integer key = Integer.valueOf(contactId); // Convert contactId to Integer
            if (contacts.containsKey(key)) {
                contacts.remove(key);
                return true; // Return true if deletion was successful
            }
        } catch (NumberFormatException e) {
            // Handle the case where contactId cannot be converted to Integer
        }
        return false; // Return false if the contact was not found or if there was a conversion error
    }

    // Updates a contact in the map based on the contact ID
    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        try {
            Integer key = Integer.valueOf(contactId); // Convert contactId to Integer
            if (contacts.containsKey(key)) {
                Contact contactToUpdate = contacts.get(key);
                contactToUpdate.setFirstName(firstName);
                contactToUpdate.setLastName(lastName);
                contactToUpdate.setPhone(phone);
                contactToUpdate.setAddress(address);
                return true; // Return true if the update was successful
            }
        } catch (NumberFormatException e) {
            // Handle the case where contactId cannot be converted to Integer
        }
        return false; // Return false if the contact was not found or if there was a conversion error
    }
}