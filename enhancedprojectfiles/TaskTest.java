/*
 * File: Task Test Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class contains unit tests for the Task class file.
 * The class has been update to check that the 'Task' object's name is correctly 
 * set to the smart default when no name is explicitly provided. 
 */

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

	@Test
public void shouldSetSmartDefaultTaskNameWhenNoNameProvided() {
    // Given
    String contactName = "Jane Doe";
    Task task = new Task(null, contactName);

    // When
    taskService.addTask(task); // Assuming taskService applies the smart default

    // Then
    String expectedDefaultName = DefaultTaskHelper.generateDefaultTaskName(contactName);
    assertEquals(expectedDefaultName, task.getName());
}

}
