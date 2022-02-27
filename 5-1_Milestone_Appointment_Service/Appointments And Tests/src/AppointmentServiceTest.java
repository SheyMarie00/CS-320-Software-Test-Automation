import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Date;

class AppointmentServiceTest {

    @Test
    void testNewAppointment()
    {
        AppointmentService service = new AppointmentService();
        service.newAppointment("1234", new Date(2020, 02, 02), "Test description");

        Appointment appointment = service.getAppointmentList().get(0);

        assertEquals("1234", appointment.getAppID());
        assertEquals(new Date(2020, 02, 02), appointment.getappDate());
        assertEquals("Test description", appointment.getappDescription());
    }

    @Test
    void testdeleteAppointment()
    {
        AppointmentService service = new AppointmentService();
        service.newAppointment("1234", new Date(2020, 02, 02), "Test description 1");
        service.newAppointment("5678", new Date(2020, 02, 03), "Test description 2");
        service.newAppointment("9012", new Date(2020, 02, 04), "Test description 3");
        assertEquals(3, service.getAppointmentList().size());
      
        service.deleteAppointment("1234");
        assertEquals(2, service.getAppointmentList().size());
      
        service.deleteAppointment("5678");
        assertEquals(1, service.getAppointmentList().size());
      
        service.deleteAppointment("9012");
        assertEquals(0, service.getAppointmentList().size());
    }
}

