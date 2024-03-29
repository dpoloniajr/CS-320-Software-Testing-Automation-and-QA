package taskService;

//We import the java util package to use the HashMap
//We also import from the task package, the Task class to use in the data structure
import java.util.HashMap;
import java.util.Map;

import task.Task;

public class TaskService {
	/*uid is set as static integer for unique id. 
	* We create a contacts Map Object and use the HashMap
	* data structure to add, delete, and update 
	* the Task Object
	*/
	private static int uid = 1000;
	private static Map<Integer, Task> tasks = new HashMap<>();
	

	
	public Map<Integer, Task> callMap() {
		return tasks;
	}
	
	
	/*
	 * This method is used to store the Task Object into
	 * the Map Object
	 */
	public Task addContact(String taskName, String taskDesc) {
		uid++;
		Task newTask = new Task(Integer.toString(uid), taskName, taskDesc);
		tasks.put(uid, newTask);
		return newTask;
	}
	
	/*
	 * We will use this method to delete a task from the
	 * Map Object, by searching for the contactId. If the Id
	 * is found the task is deleted, otherwise if not found,
	 * it will be ignored.
	 */
	@SuppressWarnings("unlikely-arg-type")
	public Map<Integer, Task> deleteContact(String taskId) {
		
		
		String remove = taskId;
		
		tasks.entrySet().removeIf(
				entry -> (remove.equals(entry.getKey())));
		uid--;
		
		return tasks;
		
	}
	
	/*
	 * With this method we take the parameters and update the Task Object in the Map
	 * data structure
	 */
	public Task updateContact(String taskid, String taskName, String taskDesc) {
        
		
		String search = taskid;
		
		if (tasks.containsKey(Integer.parseInt(search))) {
			Task updateCon = new Task(taskid, taskName, taskDesc);
			tasks.put(Integer.parseInt(taskid), updateCon);
			
			return updateCon;
		}
		
		return null;
	
	}
}
