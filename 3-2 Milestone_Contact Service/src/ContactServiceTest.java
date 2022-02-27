import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	   @Test
	    void testNewContact() throws Exception
	    {
	        ContactService service = new ContactService();
	    	service.newContact("1234", "Adam", "Sanderson","1231234321", "8932 Bellway Dr");
	        Contact contact = service.getContactList().get(0);
	        assertEquals("1234", contact.getContactID());
	        assertEquals("Adam", contact.getFirstname());
	        assertEquals("Sanderson", contact.getLastName());
	        assertEquals("1231234321", contact.getPhoneNum());
	        assertEquals("8932 Bellway Dr", contact.getAddress());
	    }
	    @Test
	    void testdeleteTast() throws Exception
	    {
	    	ContactService service = new ContactService();
	        	service.newContact("1234", "Adam", "Sanderson", "1231234321","8932 Bellway Dr");
				service.newContact("1334", "Marie", "Sanderson", "1231234321","8932 Bellway Dr");
				service.newContact("1354", "Nellie", "Sanderson", "1231234321","8932 Bellway Dr");
			
	        assertEquals(3, service.getContactList().size());
	        service.deleteContact("1234");
	        assertEquals(2, service.getContactList().size());
	        service.deleteContact("1334");
	        assertEquals(1, service.getContactList().size());
	        service.deleteContact("1354");
	        assertEquals(0, service.getContactList().size());
	    }
	    @Test 
	    void negativeTestforNewContact () throws Exception
	    {
	    	ContactService service = new ContactService();
	       	service.newContact("1234", "Adam", "Sanderson", "1231234321", "8932 Bellway Dr");
		  	assertThrows(IllegalArgumentException.class, () -> service.newContact("1234", "Adam", "Sanderson", "1231234321", "8932 Bellway Dr"));
	    }
	    @Test 
	    void negativeTestforDeleteContact () throws Exception
	    {
	      ContactService service = new ContactService(); 
	       service.newContact("1234", "Adam", "Sanderson", "1231234321", "8932 Bellway Dr");
	      assertThrows(IllegalArgumentException.class, () -> service.deleteContact("4567"));
	    }
}
