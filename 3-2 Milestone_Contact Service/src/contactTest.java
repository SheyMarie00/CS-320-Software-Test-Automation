import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class contactTest {
    @Test
    void testGetters() {
        Contact contact = new Contact("134ABC", "Adam", "Sanderson", "1231234321", "8932 Bellway Dr");

        assertEquals("134ABC", contact.getContactID());
        assertEquals("Adam", contact.getFirstname());
        assertEquals("Sanderson", contact.getLastName());
        assertEquals("1231234321", contact.getPhoneNum());
        assertEquals("8932 Bellway Dr", contact.getAddress());
    }

    @Test
    void testSetters() {
    	Contact contact = new Contact("567DEF", "Millie", "Sanderson", "1231434321", "8932 Bells Dr");

        // call setters
    	contact.setContactID("567DEF");
    	contact.setFirstname("Millie");
    	contact.setLastName("Sanderson");
    	contact.setPhoneNum("1231434321");
    	contact.setAddress("8932 Bells Dr");


        // assert that setters worked
        assertEquals("567DEF", contact.getContactID());
        assertEquals("Millie", contact.getFirstname());
        assertEquals("Sanderson", contact.getLastName());
        assertEquals("1231434321", contact.getPhoneNum());
        assertEquals("8932 Bells Dr", contact.getAddress());
    }
    @Test 
    void negativeTestforNull() 
    {
    Contact contact = new Contact("123ABC","Avery", "Muiller", "1231434321", "8932 Bells Dr");
  
    // getters 
    assertThrows(IllegalArgumentException.class, () -> contact.setContactID(null));
    assertThrows(IllegalArgumentException.class, () -> contact.setFirstname(null));
    assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
    assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum(null));
    assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));

    }
    @Test 
    void negativeTestforInvalidCharacters ()
    {
    	Contact contact = new Contact("567DEF","Avery", "Muiller", "1231434321", "8932 Bells Dr");
    	  
 
        // getters 
        assertThrows(IllegalArgumentException.class, () -> contact.setContactID("123ABC49999999563"));
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstname("Averayodijsdoifj"));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("Maudellerhausterll"));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum("12345678910"));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("8932 Bells Dr, IN Evansville 47923"));
    }
}
