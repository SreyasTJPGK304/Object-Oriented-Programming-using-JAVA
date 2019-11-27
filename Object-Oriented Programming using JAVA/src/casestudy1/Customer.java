package casestudy1;

import java.util.Scanner;

public class Customer {
	Scanner s=new Scanner(System.in);
	static int booked[]=new int[25];
	String pro="";
	String pr="";
	
	int i=1;

	
	
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;

	public void register() {
		
	do {
	
	System.out.println("Registration");
	System.out.println("Enter your name");
	name=s.next();
	System.out.println("Enter your address");
	address=s.next();
	System.out.println("Contact Number");
	contactNumber=s.next();
	System.out.println("E-Mail ID");
	email=s.next();
	System.out.println("Enter proof type");
	proofType=s.next();
	System.out.println("Enter proof id");
	proofId=s.next();
	booked[i]=1;
	System.out.println("Thank you for registering.Your id is "+i);
	i=i+1;
	System.out.println("Do you want to continue registration(yes/no)?");
	pr=s.next();
	if(pr.equals("no")) {
		
	
	System.out.println("Do you want to update the email is?(yes/no)");
	
	pro=s.next();
	if(pro.contentEquals("yes")) {
	System.out.println("update Email:");
	System.out.println("Enter new Email Id");
	email=s.next();
	System.out.println("Email updated");
	System.out.println();
	}
	
		System.out.println("Your details are as follows");
		System.out.println("Name:"+ name);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+contactNumber);
		System.out.println("E-Mail ID:"+email);
		System.out.println("Proof type:"+proofType);
		System.out.println("Proof id:"+proofId);
	}
	
	}
	while(pr.equals("yes"));
	}
}
	
