/*
 * File: Default Task Helper Test
 * Programmer Name: Domingo Polonia Jr
 * Created For: Copmuter Science Capstone CS499
 * Creation Date: February 2024
 * Date: 02-25-2024
 * Version: 1.1
 * Description: This Java class will test the logic for generation the default task names
 */

package defaulttaskhelper;

 // Import the associated class file it has a different package
import task.Task; 

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefaultTaskHelperTest {
    @Test
    public void testGenerateDefaultTaskName() {
        String contactName = "John Doe";
        String expectedTaskName = "Default Task for John Doe";
        String actualTaskName = DefaultTaskHelper.generateDefaultTaskName(contactName);
        assertEquals(expectedTaskName, actualTaskName);
    }
    // More tests with different scenarios can be created for testing
}