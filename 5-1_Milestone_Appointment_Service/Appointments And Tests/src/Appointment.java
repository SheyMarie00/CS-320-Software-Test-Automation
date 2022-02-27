import java.util.Date;
public class Appointment 
{
	public String appID; 
	public Date appDate; 
	public String appDescription;
	
	public void  setAppID(String appID)
	{
		this.appID= appID;
	}
	public void setDate(Date appDate) 
	{
		this.appDate = appDate;
	}
	public void setdescription(String appDescription)
	{
		this.appDescription = appDescription;
	}
	
	
	public String getAppID()
	{
		return appID;
	}
	public Date getappDate() 
	{
	  return appDate;
	}
	public String getappDescription()
	{
	   return appDescription;
	}
	
	public Appointment(String appID, Date appDate, String appDescription)
	{
		appID = this.appID; 
		appDate = this.appDate; 
		appDescription = this.appDescription; 
	  

	if (appID == null || appID.length() > 10)
	{
	  throw new IllegalArgumentException("Invalid Appointment ID");
	}
	if (appDate == null)
	{
	  throw new IllegalArgumentException("Invalid Date");
	}
	if (appDescription== null || appDescription.length() > 50)
	{
	  throw new IllegalArgumentException("Invalid description");
	}
}
}

