package taskService;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import task.Task;

class TaskServiceTest {

	@Test
	void testAddContactAndUniqueId() {
		TaskService serv = new TaskService();
		serv.addContact("Clean Room", "Make sure room is done.");
		assertTrue(serv.callMap().containsKey(1001));

	}

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
