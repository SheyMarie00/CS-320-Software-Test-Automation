import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class AppointmentService 
{
	public List<Appointment> appList = new ArrayList<Appointment>();

	public void newAppointment(String appID, GregorianCalendar date, String description) throws Exception
	{
      for(int i = 0; i< appList.size(); i++) {
        if (appID.equals(appList.get(i).getAppID())) 
        {
        	 throw new IllegalArgumentException("Appointment already exists"); 
        }
      }
      
      appList.add(new Appointment(appID, date, description));
	}

	public void deleteAppointment(String id) throws Exception
    {
      for(int i = 0; i< appList.size(); i++) {
        if (id.equals(appList.get(i).getAppID())) 
        {
          appList.remove(i);
          return;
        }
        throw new IllegalArgumentException("Appointment already deleted or does not exist");
      }
	}

	  public List<Appointment> getAppointmentList() 
	  { 
		  return appList; 
	  }

}