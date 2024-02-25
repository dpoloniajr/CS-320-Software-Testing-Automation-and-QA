# Category 1: Software Engineering and Design


The artifacts selected for enhancement in the software engineering and design category are Task and Task Service class, part of the Grand Strand Application Project in the Software Testing, Automation, and Quality Assurance course (CS320). The artifacts were originally created in December 2021, and the two Java class files were developed to use in-memory data structures to support storing tasks. The Task class required a name string field between 1 and 20 characters, therefore not null, and a description field of no more than 50 characters. The Task Service Class required a unique ID with the ability to delete and update tasks per task ID. Only the name and description fields can be updated. 



### The Task and Task Service class files were selected to demonstrate the following: 
#### Demonstrating an ability to use well-founded and innovative techniques, skills, and tools in computing practices for the purpose of implementing computer solutions that deliver value and accomplish industry-specific goals (software engineering/design/database) by:
1.	Using smart default logic to improve the overall user experience.
2.	Creating a helper class to implement the smart default functionality and allow for developer collaboration and configuration management.
3.	Integrating the smart default logic into the task creation form, using the contact name as a parameter for the task input.


#### The enhancements made to implement the smart defaults logic in the Task and Task Service class, along with its corresponding Contact class files, demonstrate a variety of skills and abilities to software engineering and design such as:
1. Algorithmic thinking and problem-solving by understanding the functionality of the software, how users will interact with the application, and creating enhancements that demonstrate the ability to anticipate user needs. 
2. focus on software architecture and design by using a helper class to manage default values and structure the code in a maintainable and scalable way, adhering to software architecture practices commonly used for setting specific behaviors.
3. Testing and quality assurance using a unit test to verify the smart defaults functionality passes in different scenarios through the composition of testable code, also known as Test-Driven Development (TDD).

   
#### Enhancements to the artifact include the following: 
1.	Created a helper class file, which contains the logic for generating default task names
2.	Modified the Task class file to call ‘DefaultTaskHelper.generateDefaulTaskName’ when a contact is selected.
3.	Updated the Task and TaskService class files to use ‘DefaultTaskHelper’ to set the default name when a new task is created without a specific name.
4.	Created a new test class, ‘DefaultTaskHelperTest’, and wrote unit tests that pass contact names to ‘generateDefaultTaskName’ and return the correct default task name.
5.	Updated the TaskServiceTest class file to test that when a new task is created with a selected contact, the default name is set correctly.
6.	Added a header to the code files, followed by updating code comments throughout the class files.

