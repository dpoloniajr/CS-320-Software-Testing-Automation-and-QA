/*
 * File: Task Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.2
 * Description: This Java class uses in-memory data structures to support storing tasks (no database required).
 * The Task Class requirements are: 
 * 1. The task object shall have a required unique task ID String that cannot be longer than 10 characters. 
 * 2. The task ID shall not be null and shall not be updatable.
 * 3. The task object shall have a required name String field that cannot be longer than 20 characters. 
 * 4. The name field shall not be null. 
 * 5. The task object shall have a required description String field that cannot be longer than 50 characters. 
 * 6. The description field shall not be null.
 */

package task;

// Import the DefaultTaskHelper class
import defaulttaskhelper.DefaultTaskHelper;

public class Task {

	// Initialize the variables to be used in the constructor and mutator/accessor methods
	private String taskId;
	private String name;
	private String description;

	/*
	 * The constructor with its parameters and conditionals set to the 
	 * specifications in the requirements doc. Then assigning the values 
	 * if the conditional statements pass.
	 */

	/*
     * Modified constructor to include logic for setting a default name using
     * DefaultTaskHelper when name is not provided.
     * Original parameters and conditionals set to the specification requirements
	 * remain and the values are assigned if the conditional statements pass.
     */
	
	 public Task(String id, String name, String desc, String contactName) { // Added contactName parameter

        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid Id");
        }

        // Check if name is provided, else use DefaultTaskHelper to generate it
        if (name == null || name.isEmpty()) {
            this.name = DefaultTaskHelper.generateDefaultTaskName(contactName); // Generate default name based on contact
        } else if (name.length() > 20) {
            throw new IllegalArgumentException("Invalid Task Name");
        } else {
            this.name = name;
        }

        if (desc == null || desc.length() > 50) {
            throw new IllegalArgumentException("Invalid Description");
        }

        this.taskId = id;
        this.description = desc;
    }

	//Accessor method for the task id variable
	public String getTaskId() {
		return taskId;
	}
	//Mutator method for the task id variable
	public void setTasktId(String taskId) {
		this.taskId = taskId;
	}

	//Accessor method for the task name variable
	public String getTasktName() {
		return name;
	}
	
	//Mutator method for the task name variable
	public void setTaskName(String name) {
		this.name = name;
	}

	//Accessor method for the description variable
	public String getDescription() {
		return description;
	}
	
	//Mutator method for the description variable
	public void setDescription(String desc) {
		this.description = desc;
	}

}
