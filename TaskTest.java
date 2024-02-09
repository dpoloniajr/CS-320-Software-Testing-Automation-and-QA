package task;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaskTest {
    
	@Test
	void testContactConstructor() {
		Task task = new Task("1002", "Move the desk", "Move the desk to the corner");
		assertTrue(task.getTaskId().equals("1002"));
		assertTrue(task.getTasktName().equals("Move the desk"));
		assertTrue(task.getDescription().equals("Move the desk to the corner"));
	}
	
	@Test
	void testTaskIdLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("27685940321" , "Move the desk", "Move the desk to the corner");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null , "Move the desk", "Move the desk to the corner");
		});
	}
	
	@Test
	void testTaskNameLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1231" , "Domingoniusmaximonius", "Polonia");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1231" , null, "Polonia");
		});
	}
	
	@Test
	void testLastNameLengthAndNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1231" , "Domingo", "Polonianemus-Pandaemoniusmaximoonius correctimonius");
		});
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1231" , "Domingo", null);
		});
	}
	
	@Test
	void testMutatorMethods() {
		Task task = new Task("1002", "Domingo", "Polonia");
		task.setTasktId("1345");
		task.setTaskName("Kareen");
		task.setDescription("Dolson");
		assertTrue(task.getTaskId().equals("1345"));
		assertTrue(task.getTasktName().equals("Kareen"));
		assertTrue(task.getDescription().equals("Dolson"));
	}

}
