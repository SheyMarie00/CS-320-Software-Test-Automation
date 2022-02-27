import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class AppointmentTest1 {

	@Test
	void testAppointment() 
	{
		String appID = "134ABC";
		Date date = new Date(2021, Calendar.JANUARY,1); 
		String appDescription= "Test Description";
		Appointment appt = new Appointment(appID,date,appDescription);
		assertNotNull(appt);
	}

}
