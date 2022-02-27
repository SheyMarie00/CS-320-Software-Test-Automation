import java.util.ArrayList;
import java.util.List;

public class TaskService 

{
	public List<Task> taskList = new ArrayList<Task>();

	public void newTask(String taskID, String Name, String Description) throws Exception
	{
      for(int i = 0; i< taskList.size(); i++) {
        if (taskID.equals(taskList.get(i).getTaskID())) 
        {
        	 throw new IllegalArgumentException("Task already exists"); 
        }
      }
      
      taskList.add(new Task(taskID, Name, Description));
	}

	public void deleteTask(String id)
    {
      for(int i = 0; i< taskList.size(); i++) {
        if (id.equals(taskList.get(i).getTaskID())) 
        {
        	taskList.remove(i);
        	return;
        }
        throw new IllegalArgumentException("Task already deleted or does not exist");
      }
	}

	  public List<Task> getTaskList() 
	  { 
		  return taskList; 
	  }


	
}
