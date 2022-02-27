import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.GregorianCalendar;

class AppointmentServiceTest {

    @Test
    void testNewAppointment() throws Exception
    {
   	    GregorianCalendar now = new GregorianCalendar(); 
        AppointmentService service = new AppointmentService();
        service.newAppointment("1234",now, "Test description");
        Appointment appointment = service.getAppointmentList().get(0);
        assertEquals("1234", appointment.getAppID());
        assertEquals(now, appointment.getappDate());
        assertEquals("Test description", appointment.getappDescription());
    }

    @Test
    void testdeleteAppointment() throws Exception
    {
   	    GregorianCalendar now = new GregorianCalendar(); 
        AppointmentService service = new AppointmentService();
        service.newAppointment("1234", now, "Test description 1");
        service.newAppointment("5678", now, "Test description 2");
        service.newAppointment("9012", now, "Test description 3");
        assertEquals(3, service.getAppointmentList().size());
      
        service.deleteAppointment("1234");
        assertEquals(2, service.getAppointmentList().size());
      
        service.deleteAppointment("5678");
        assertEquals(1, service.getAppointmentList().size());
      
        service.deleteAppointment("9012");
        assertEquals(0, service.getAppointmentList().size());
    }
    @Test 
    void negativeTestforNewContact() throws Exception 
    {
    	 GregorianCalendar now = new GregorianCalendar(); 
    	 AppointmentService service = new AppointmentService();
    	 service.newAppointment("1334", now, "Random Description");
		 assertThrows(IllegalArgumentException.class, () -> service.newAppointment("1234", now, "Random Description"));

    }
    @Test 
    void negativeTestforDeleteContact() throws Exception 
    {
     GregorianCalendar now = new GregorianCalendar(); 
   	 AppointmentService service = new AppointmentService();
   	 service.newAppointment("1334", now, "Random Description");
   	assertThrows(IllegalArgumentException.class, () -> service.deleteAppointment("4567"));
    }
}

