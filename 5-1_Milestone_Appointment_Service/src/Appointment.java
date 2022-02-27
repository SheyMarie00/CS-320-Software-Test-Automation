import java.util.GregorianCalendar;
public class Appointment 
{
	private  String appID; 
	private GregorianCalendar appDate; 
	private String appDescription;
	
	private static final int  APPIDLENG = 10; 
	private static final byte APPDESCRIPTELENG = 50;
	
  
  public Appointment(String appID, GregorianCalendar appDate, String appDescription)
  {
   setAppID(appID);
   setAppDate(appDate);
   setDescription(appDescription);
	
  }
  
	public void  setAppID(String appID)
	{
		
      if (appID == null) 
      {
    	  throw new IllegalArgumentException("Appointment ID cannot be null");
      }
      else if (appID.length() > APPIDLENG)
	{
		  throw new IllegalArgumentException("Appointment ID cannot be longer than " + APPIDLENG + " characters. The current length of your input is: " + appID.length());
	}
      else 
      {
        this.appID= appID;
      }
	}
	public void setAppDate(GregorianCalendar appDate) 
	{
     
     if(appDate == null) 
     {
    	 throw new IllegalArgumentException("The date shall not null.");
     }
     else if (appDate.before(new GregorianCalendar()))
        {
      
          throw new IllegalArgumentException("The date shall not be in the past. Current date is: " + appDate);
        }
        else 
        {
          this.appDate = appDate;
        }
		
	}
	public void setDescription(String appDescription)
	{
		if (appDescription == null) 
		{
			  throw new IllegalArgumentException("The description shall not be null");

		}
		else if (appDescription.length() > APPDESCRIPTELENG)
		{
			  throw new IllegalArgumentException("Appointment description cannot be longer than " + APPDESCRIPTELENG + " characters. The current length of your input is: " + appDescription.length());

		}
		else 
		{
			this.appDescription = appDescription;
		}
		
	}
	public String getAppID()
	{
		return appID;
	}
	public GregorianCalendar getappDate() 
	{
	  return appDate;
	}
	public String getappDescription()
	{
	   return appDescription;
	}
	
	
}

