package contactService;

//We import the java util package to use the HashMap
//We also import from the contact package, the Contact class to use in the data structure
import java.util.*;
import java.util.Map.Entry;
import contact.Contact;

public class ContactService {
	/*uid is set as static integer for unique id. 
	* We create a contacts Map Object and use the HashMap
	* data structure to add, delete, and update 
	* the Contact Object
	*/
	private static int uid = 1000;
	private static Map<Integer, Contact> contacts = new HashMap<>();
	

	
	public Map<Integer, Contact> callMap() {
		return contacts;
	}
	
	
	/*
	 * This method is used to store the Contact Object into
	 * the Map Object
	 */
	public Map<Integer, Contact> addContact(Contact contact) {
		uid++;
		contacts.put(uid, contact);
		return contacts;
	}
	
	/*
	 * We will use this method to delete a contact from the
	 * Map Object, by searching for the contactId. If the Id
	 * is found the contact is deleted, otherwise if not found,
	 * it will be ignored.
	 */
	public Map<Integer, Contact> deleteContact(String contactId) {
		
		
		String remove = contactId;
		
		contacts.entrySet().removeIf(
				entry -> (remove.equals(entry.getValue().getContactId())));
		
		
		return contacts;
		
	}
	
	/*
	 * With this method we take the parameters and update the Contact Object in the Map
	 * data structure
	 */
	public Map<Integer, Contact> updateContact(String contactId, 
			String firstName, String lastName, String phone, String address) {
		
/*		Iterator<Entry<Integer, Contact>> itr = contacts.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>)itr.next();
			if (entry.getValue().getContactId() == contactId) {
				entry.getValue().setFirstName(firstName);
				entry.getValue().setLastName(lastName);
				entry.getValue().setPhone(phone);
				entry.getValue().setAddress(address);
			}
		}*/
		
		if (contacts.containsValue(contactId)) {
			contacts.get(contactId).setFirstName(firstName);
			contacts.get(contactId).setLastName(lastName);
			contacts.get(contactId).setPhone(phone);
			contacts.get(contactId).setAddress(address);
		}
		
		
		return contacts;
	}
}
