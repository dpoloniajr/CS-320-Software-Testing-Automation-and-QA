/*
 * File: Default Task Helper
 * Programmer Name: Domingo Polonia Jr
 * Created For: Copmuter Science Capstone CS499
 * Creation Date: February 2024
 * Date: 02-25-2024
 * Version: 1.1
 * Description: This Java class will contain the logic for generation the default task names
 */

 // A defaulttaskhelper package is created to separate the code into directories
package defaulttaskhelper;

// Import the associated class file it has a different package
import task.Task; 

public class DefaultTaskHelper {

	// The logic to generate and return the default task name
	public static String generateDefaultTaskName(String contactName) {
		return "Default Task for " + contactName; // Placeholder logic
		}

		// Method to create a Task object with smart defaults
		public static Task createTaskWithDefaults(String id, String contactName, String desc) {
			String defaultName = generateDefaultTaskName(contactName);
			return new Task(id, defaultName, desc); // Using the Task constructor
		}
}
