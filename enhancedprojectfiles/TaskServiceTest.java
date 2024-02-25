/*
 * File: Contact Service Test Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class contains unit tests for the Task Service class file.
 */

 package taskService;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import static org.junit.jupiter.api.Assertions.assertFalse;
 import static org.junit.jupiter.api.Assertions.assertTrue;
 
 import org.junit.jupiter.api.Test;
 
 import task.Task;
 
 class TaskServiceTest {
 
	 @Test
	 void testAddTaskWithSmartDefaults() {
		 TaskService service = new TaskService();
 
		 // Assuming DefaultTaskHelper generates "Default Task for John Doe" when no name is provided
		 Task addedTask = service.addTask("", "Make sure room is done.", "John Doe");
 
		 // Verify that the task name has been set with smart defaults based on the contact name
		 assertEquals("Default Task for John Doe", addedTask.getTaskName());
		 assertEquals("Make sure room is done.", addedTask.getDescription());
	 }
 
	 @Test
	 void testDeleteTask() {
		 TaskService service = new TaskService();
		 Task addedTask = service.addTask("Clean Room", "Make sure room is done.", "John Doe");
		 String taskId = addedTask.getTaskId();
		 service.deleteTask(taskId);
		 assertFalse(service.callMap().containsKey(Integer.parseInt(taskId)));
	 }
 
	 @Test
	 void testUpdateTask() {
		 TaskService service = new TaskService();
		 Task addedTask = service.addTask("Clean Room", "Make sure room is done.", "John Doe");
		 Task updatedTask = service.updateTask(addedTask.getTaskId(), "Furnish Room", "Refurnish the entire room.");
 
		 assertEquals("Furnish Room", updatedTask.getTaskName());
		 assertEquals("Refurnish the entire room.", updatedTask.getDescription());
	 }
 }
 