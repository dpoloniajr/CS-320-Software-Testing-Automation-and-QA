package taskService;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task.Task;

class TaskServiceTest {

	@Test
	void testAddContactWithSmartDefaults() {
		TaskService serv = new TaskService();

		// add a contact with a specific name
		Task addedTask = service.addContact("Clean Room", "Make sure room is done.", "John Doe");

		//Verify that the task name and description have been set with smart defaults based on the contact name
		assertEquals("Follow up with John Doe", addedTask.getTasktName()):
		assertEquals("Follow-up task for contact: John Doe", addedTask.getTaskDescription()):

	}

	// Other existing test methods remain unchanged

	@Test
	void testDeleteContact() {
		TaskService ser = new TaskService();
		ser.addContact("Clean Room", "Make sure room is done.");
		assertFalse(ser.deleteContact("1002").containsKey(1002));

	}

	@Test
	void testUpdateContact() {
		TaskService ser = new TaskService();
		Task task = ser.addContact("Clean Room", "Make sure room is done");
		Task upd = ser.updateContact(task.getTaskId(), "Furnish Room", "Make sure room is done.");
		assertEquals(true, upd.getTasktName().equals("Furnish Room"));
	}

}
