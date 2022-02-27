import static org.junit.jupiter.api.Assertions.*;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

class AppointmentTest {


	@Test
    void testGetters() 
    {
		GregorianCalendar now = new GregorianCalendar(); 
	    Appointment appt = new Appointment("134ABC", now, "Test Description");
        assertEquals("134ABC", appt.getAppID());
        assertEquals(now, appt.getappDate());
        assertEquals("Test Description", appt.getappDescription());
    }

    @Test
    void testSetters() {
    	GregorianCalendar now = new GregorianCalendar(); 
        Appointment appt = new Appointment("134ABC", now, "Test Description");

        // call setters
        appt.setAppID("567DEF");
        appt.setAppDate(now);
        appt.setDescription("Another Description");

        // assert that setters worked
        assertEquals("567DEF", appt.getAppID());
        assertEquals(now, appt.getappDate());
        assertEquals("Another Description", appt.getappDescription());
    }
    @Test 
    void negativeTestforNull()
    {
	 GregorianCalendar now = new GregorianCalendar(); 
     Appointment appt = new Appointment("134ABC", now, "Test Description");
   	 assertThrows(IllegalArgumentException.class, () -> appt.setAppID(null));
   	 assertThrows(IllegalArgumentException.class, () -> appt.setAppDate(null));
   	 assertThrows(IllegalArgumentException.class, () -> appt.setDescription(null));
    }	
    @Test 
    void negativeTestforInvalidDate() 
    {
    //creating dates
	 GregorianCalendar now = new GregorianCalendar(); 
	 GregorianCalendar past = new GregorianCalendar(2020, 12, 12);
     Appointment appt = new Appointment("134ABC", now, "Test Description");
   	 assertThrows(IllegalArgumentException.class, () -> appt.setAppDate(past));
    }
    @Test
    void negativeTestforInvalidInput ()
    {
    	GregorianCalendar now = new GregorianCalendar(); 
        Appointment appt = new Appointment("134ABC", now, "Test Description");
      	 assertThrows(IllegalArgumentException.class, () -> appt.setAppID("123ABC49999999563"));
      	 assertThrows(IllegalArgumentException.class, () -> appt.setDescription("Random text to surpass the character limit so i can check to see if this runs accordingly"));
    }
}
