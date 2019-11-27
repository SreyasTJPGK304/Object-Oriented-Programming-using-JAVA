package encapsulation;
import java.util.Scanner;
public class Encapcase2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		do {
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println("Enter your name");
		c.setName(s.next());
		System.out.println("Enter your address");
		c.setAddress(s.next());
		System.out.println("Enter your Contact Number");
		c.setContact(s.next());
		System.out.println("E-Mail ID");
		c.setEmail(s.next());
		System.out.println("Enter your prooftype");
		c.setproofType(s.next());
		System.out.println("Enter your proofid");
		c.setproofID(s.next());
		
		if(c.getName()==null) {
			System.out.println("Invalid name");
		}
		if(c.getAddress()==null) {
			System.out.println("Invalid address");
		}
		if(c.getContact()==null) {
			System.out.println("Invalid contact");
		}
		if(c.getEmail()==null) {
			System.out.println("Invalid email");
		}
		if(c.getProofType()==null) {
			System.out.println("Invalid prooftype");
		}
		if(c.getProofID()==null) {
			System.out.println("Invalid proofid");
		}	
		
		}while(c.getName()==null || c.getAddress()==null||c.getContact()==null||c.getEmail()==null||c.getProofType()==null||c.getProofID()==null);
		
		if(c.getName()!=null && c.getAddress()!=null && c.getContact()!=null && c.getEmail()!=null && c.getProofType()!=null && c.getProofID()!=null) {
		
		
		c.register(c.getName(),c.getAddress(),c.getContact(),c.getEmail(),c.getProofType(),c.getProofID());
		
		
		}
	}

}
