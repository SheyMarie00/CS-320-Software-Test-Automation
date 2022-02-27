import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class taskTest {

	@Test
	void testTaskGetters() 
	{
				Task task = new Task("134ABC","Saffron's Task", "Test Description");
		        assertEquals("134ABC", task.getTaskID());
		        assertEquals("Saffron's Task", task.getName());
		        assertEquals("Test Description", task.getDescription());
 }
 @Test
  void testTaskSetters() 
 {
   Task task = new Task("134ABC", "AmandaTestResults", "Test Description");
		        // call setters
   				task.setTaskID("567DEF");
   				task.setTaskName("Allie");
   				task.setTaskDescription("Another Description part 1");

		        // assert that setters worked
		        assertEquals("567DEF", task.getTaskID());
		        assertEquals("Allie", task.getName());
		        assertEquals("Another Description part 1", task.getDescription());
		    }
 
 @Test 
 void negativeTestforNull()
 {
	 Task task = new Task("134ABC", "AmandaTestResults", "Test Description");
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskID(null));
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskName(null));
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskDescription(null));
 }	
 @Test 
 void negativeTestforInvalidCharacters() 
 {
	 Task task = new Task("134ABC", "Amanda", "Test Description");
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskID("123ABC49999999563"));
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskName("Test Task Name That surpasses character limit"));
	 assertThrows(IllegalArgumentException.class, () -> task.setTaskDescription("Random tesxt to surpass the character limit so i can check to see if this runs accordingly"));
	 
 }
}
