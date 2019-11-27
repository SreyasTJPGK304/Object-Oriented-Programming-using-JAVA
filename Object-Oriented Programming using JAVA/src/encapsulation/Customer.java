package encapsulation;

public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	public String getName() {
		return this.name;
	}
	public boolean setName(String name) {
		 if (name.matches("^[a-zA-Z]*$"))
		 {
		this.name=name;
		return true;
		 }
		 else
	        {
	            
	            return false;
	        }
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
		if(address.matches("^[a-zA-Z0-9]*$"))
		{
		this.address = address;
		return true;
		}
		else {
			
			return false;
		}
	}
	 public String getContact()
     {
         return this.contactNumber;
     }
	public boolean setContact(String contact)
    {
        if (contact.matches("^[0-9]*$"))
        {
            this.contactNumber=contact;
            return true;
        }
        else
        {
            
            return false;
        }
    }
	public String getEmail()
    {
        return this.email;
    }
	public boolean setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            
            return false;
        }
    }
	public String getProofType() {
		return this.proofType;
	}
	public boolean setproofType(String proofType) {
		 if (proofType.matches("^[a-zA-Z]*$"))
		 {
		this.proofType=proofType;
		return true;
		 }
		 else
	        {
	            
	            return false;
	        }
	}
	public String getProofID() {
		return this.proofID;
	}
	public boolean setproofID(String proofID) {
		if(proofID.matches("^[a-zA-Z0-9]*$"))
		{
		this.proofID = proofID;
		return true;
		}
		else {
			
			return false;
		}
	}
	public void register(String name,String address,String contactNumber,String email,String proofType,String proofID) {
			int a[]=new int[25];
			int i=1;
		System.out.println("Your Details");
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(contactNumber);
		System.out.println(email);
		System.out.println(proofType);
		System.out.println(proofID);
		System.out.println("Your id is "+i);
		i++;
		
	}
	
	

}
