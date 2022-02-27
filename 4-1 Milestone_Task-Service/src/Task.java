
public class Task
{
	private String TaskID; 
	private String Name;
	private String description;
	
	private static final int  TASKIDLENG = 10; 
	private static final byte TASKNAMELENG = 20; 
	private static final byte TASKDESCRIPTELENG = 50;

	public void setTaskID(String TaskID)
	{
		if (TaskID == null)
		{
			  throw new IllegalArgumentException("Task ID cannot be null");
		}
		else if (TaskID.length() > TASKIDLENG)
		{
		  throw new IllegalArgumentException("Task ID cannot be longer than" + TASKIDLENG + " characters. The current length of your input is: " + TaskID.length());
		}
		else 
		{
			this.TaskID= TaskID;
		}
	}
	public void setTaskName(String Name) 
	{

		if (Name == null)
		{
			 throw new IllegalArgumentException("Name cannot be null");
		}
		else if (Name.length() > TASKNAMELENG)
		{
		  throw new IllegalArgumentException("Task Name cannot be longer than: " + TASKNAMELENG + " characters. The current length of your input is: " + Name.length());
		}
		else 
		{
			this.Name = Name;
		}
	}
	public void setTaskDescription(String description)
	{
		if (description== null)
		{
			 throw new IllegalArgumentException("description cannot be null");
		}
		else if (description.length() > TASKDESCRIPTELENG)
			
		{
			throw new IllegalArgumentException("Task Description cannot be longer than: " + TASKDESCRIPTELENG + " characters. The current length of your input is: " + description.length());
		}
		else 
		{
			this.description = description;
		}
		
	}
	
	public String getTaskID()
	{
		return TaskID;
	}
	public String getName() 
	{
	  return Name;
	}
	public String getDescription()
	{
	   return description;
	}
	
	public Task (String TaskID, String Name, String description)
	{
		setTaskID(TaskID);
		setTaskName(Name);
		setTaskDescription(description);
	 }
}
