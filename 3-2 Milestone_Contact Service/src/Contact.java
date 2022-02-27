
public class Contact 
{
	private String contactID; 
	private String firstName;
	private String lastName; 
	private String phoneNum;
	private String address; 
	
	private static final int CONTACTIDLENG = 10; 
	private static final byte FIRSTNAMELENG = 10; 
	private static final byte LASTNAMELENG = 10;
	private static final byte PHONENUMLENG = 10; 
	private static final byte ADDRESSLENG = 30; 

	public void setContactID(String contactID)
	{
		if (contactID == null) 
		{
			  throw new IllegalArgumentException("contact ID cannot be Null");
		}
		else if	(contactID.length() > CONTACTIDLENG)
		{
		  throw new IllegalArgumentException("contact ID cannot be longer than " + CONTACTIDLENG + " characters. The current length of your input is: " + contactID.length());
		}
		else 
		{
			this.contactID = contactID;
		}
		
	}
	public void setFirstname(String firstName) 
	{
		if (firstName == null )
		{
			 throw new IllegalArgumentException("First name cannot be null");
		}
		else if (firstName.length() > FIRSTNAMELENG)
		{
		  throw new IllegalArgumentException("First name cannot be longer than" + FIRSTNAMELENG + " characters. The current length of your input is: " + firstName.length());
		}
		else 
		{
			this.firstName = firstName;
		}
		
	}
	public void setLastName(String lastName)
	{
		if (lastName == null ) 
		{
			throw new IllegalArgumentException("Last name cannot be Null");
		}
		else if (lastName.length() > LASTNAMELENG)
		{
			  throw new IllegalArgumentException("Last name cannot be longer than" + LASTNAMELENG + " characters. The current length of your input is: " + lastName.length());
		}
		else 
		{
			this.lastName = lastName;
		}
		
	}
	public void setPhoneNum(String phoneNum)
	{
		if (phoneNum== null) 
		{
			throw new IllegalArgumentException("phone Number cannot be Null");
		}
		else if (phoneNum.length() > PHONENUMLENG)
		{
			  throw new IllegalArgumentException("phone Number cannot be longer than" + PHONENUMLENG + " characters. The current length of your input is: " + phoneNum.length());
		}
		else 
		{
			this.phoneNum = phoneNum;
		}
		
	}
	public void setAddress(String address)
	{
		if (address  == null)
		{
			throw new IllegalArgumentException("address cannot be Null");

		}
		else if (address.length() > ADDRESSLENG)
		{
			  throw new IllegalArgumentException("Address cannot be longer than" + ADDRESSLENG + " characters. The current length of your input is: " + address.length());
		}
		else 
		{
			this.address = address; 
		}
		
	}
	
	public String getContactID()
	{
		return contactID;
	}
	public String getFirstname() 
	{
	  return firstName;
	}
	public String getLastName()
	{
	   return lastName;
	}
	public String getPhoneNum()
	{
	  return phoneNum;
	}
	public String getAddress()
	{
	 return address; 
	}
	
	
	public Contact (String contactID, String FN, String LN, String phone, String address)
	{
		setContactID(contactID);
		setFirstname(FN);
		setLastName(LN);
		setPhoneNum(phone);
		setAddress(address);
	}
}