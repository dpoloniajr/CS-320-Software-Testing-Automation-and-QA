package task;

public class Task {

	/*
	 * We initialize our variables to be used in the constructor and 
	 * mutator/accessor methods
	 */
	private String taskId;
	private String name;
	private String description;

	/*
	 * Our constructor with its parameters and conditionals set to the 
	 * specifications in the requirements doc. Then assigning the values 
	 * if the conditional statements pass.
	 */
	
	public Task(String id, String name, String desc) {

		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}

		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Task Name");
		}

		if (desc == null || desc.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.taskId = id;
		this.name = name;
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
