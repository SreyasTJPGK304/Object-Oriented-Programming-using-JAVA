package encapsulation;
import java.util.Scanner;
public class encapcase1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Guest g=new Guest();
		Display d=new Display();
		
		
		System.out.println("Enter your name");
		g.setName(s.next());
		System.out.println("Enter your address");
		g.setAddress(s.next());
		System.out.println("Enter your Contact Number");
		g.setContactNumber(s.next());
		System.out.println("E-Mail ID");
		g.setEmail(s.next());
		System.out.println("Enter your prooftype");
		g.setProofType(s.next());
		System.out.println("Enter your proofid");
		g.setProofID(s.next());
		
		d.register(g.getName(),g.getAddress(),g.getContactNumber(),g.getEmail(),g.getProofType(),g.getProofID());

		


		


		

	}

}
