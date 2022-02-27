import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService 
{
	public List<Appointment> appList = new ArrayList<>();
	public Appointment NewAppointment(String appID, Date date, String description) 
	{
	  Appointment appt = new Appointment(appID,date,description);
	  appList.add(appt);
	  return appt;
	}

	  public void deleteAppointment(String id) throws Exception {
		  appList.remove(searchForAppointment(id));
	  }

	  public List<Appointment> getAppointmentList() 
	  { 
		  return appList; 
		  }

	  private Appointment searchForAppointment(String id) throws Exception {
	    int index = 0;
	    while (index < appList.size()) {
	      if (id.equals(appList.get(index).getAppID())) {
	        return appList.get(index);
	      }
	      index++;
	    }
	    throw new Exception("The appointment does not exist!");
	  }
}