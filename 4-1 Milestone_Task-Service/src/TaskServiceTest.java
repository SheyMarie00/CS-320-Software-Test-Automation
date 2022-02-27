import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TaskServiceTest 
{

    @Test
    void testNewAppointment() throws Exception
    {
        TaskService service = new TaskService();
        service.newTask("1234", "Starting Task Name", "Test description");

        Task task = service.getTaskList().get(0);

        assertEquals("1234", task.getTaskID());
        assertEquals("Starting Task Name", task.getName());
        assertEquals("Test description", task.getDescription());
    }

    @Test
    void testdeleteAppointment() throws Exception
    {
    	TaskService service = new TaskService();
        service.newTask("1234", "TaskName1", "Test description 1");
        service.newTask("5678", "TaskName2", "Test description 2");
        service.newTask("9012", "TaskName3", "Test description 3");
        assertEquals(3, service.getTaskList().size());
      
        service.deleteTask("1234");
        assertEquals(2, service.getTaskList().size());
      
        service.deleteTask("5678");
        assertEquals(1, service.getTaskList().size());
      
        service.deleteTask("9012");
        assertEquals(0, service.getTaskList().size());
    }
    @Test 
    void negativeTestforNewTask () throws Exception
    {
    	TaskService service = new TaskService();
       	service.newTask("4422", "TaskName", "TaskDescription");
	  	assertThrows(IllegalArgumentException.class, () -> service.newTask("4422", "TaskName", "TaskDescription"));
    }
    @Test 
    void negativeTestforDeleteTask () throws Exception
    {
    	TaskService service = new TaskService(); 
        service.newTask("4422", "TaskName", "TaskDescription");
        assertThrows(IllegalArgumentException.class, () -> service.deleteTask("4567"));
    }
}

