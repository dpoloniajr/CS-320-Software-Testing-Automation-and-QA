/*
 * File: Task Service Class
 * Programmer Name: Domingo Polonia Jr
 * Created For: Software Testing Automation and Quality Assurance CS320
 * Creation Date: December 2021
 * Course: CS499 Capstone
 * Date: 02-25-2024
 * Version: 2.1
 * Description: This Java class is used to handle interactions between the data and the application.
 * The Task Class requirements are: 
 * 1. The task service shall be able to add tasks with a unique ID.
 * 2. The task service shall be able to delete tasks per taskId.
 * 3. The task service shall be able to update task fields per taskId.
 * 4. The name and description fields are updatable.
 */

package taskService;

import java.util.HashMap;
import java.util.Map;

import task.Task;
import defaulttaskhelper.DefaultTaskHelper; // Ensure this import matches the actual package and class name

public class TaskService {
    private static int uid = 1000;
    private static Map<Integer, Task> tasks = new HashMap<>();

    public Map<Integer, Task> callMap() {
        return tasks;
    }

    /*
     * Use DefaultTaskHelper for generating task names when no specific name is provided.
     */
    public Task addTask(String taskName, String taskDesc, String contactName) {
        uid++;
        // Check if taskName is provided; if not, use DefaultTaskHelper to generate it
        if (taskName == null || taskName.isEmpty()) {
            taskName = DefaultTaskHelper.generateDefaultTaskName(contactName); // Use DefaultTaskHelper
        }
        // Use provided taskDesc or set a default description
        if (taskDesc == null || taskDesc.isEmpty()) {
            taskDesc = "Task related to " + contactName;
        }
        Task newTask = new Task(Integer.toString(uid), taskName, taskDesc);
        tasks.put(uid, newTask);
        return newTask;
    }
    
    // Methods for deleting and updating tasks
    
    @SuppressWarnings("unlikely-arg-type")
    public Map<Integer, Task> deleteTask(String taskId) {
        int removeId;
        try {
            removeId = Integer.parseInt(taskId);
        } catch (NumberFormatException e) {
            // Handle the case where taskId is not an integer
            return tasks; // Or consider throwing an IllegalArgumentException
        }

        tasks.remove(removeId);
        return tasks;
    }
    
    public Task updateTask(String taskId, String taskName, String taskDesc) {
        int searchId;
        try {
            searchId = Integer.parseInt(taskId);
        } catch (NumberFormatException e) {
            return null; // Or consider throwing an IllegalArgumentException
        }

        if (tasks.containsKey(searchId)) {
            Task updatedTask = new Task(taskId, taskName, taskDesc);
            tasks.put(searchId, updatedTask);
            return updatedTask;
        }

        return null;
    }
}
