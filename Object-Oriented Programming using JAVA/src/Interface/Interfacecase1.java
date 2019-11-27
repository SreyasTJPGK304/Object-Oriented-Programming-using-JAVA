package Interface;
import java.util.Scanner;
public class Interfacecase1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Guest1 g=new Guest1();
		int a[]=new int[25];
		int i=1;
		String name;
		String address;
		int contact;
		String mail;
		String prooftype;
		int proofid;
		String pro="";
		String po="";
		do {
			System.out.println("Enter your name");
			 name=s.next();
			System.out.println("Enter your address");
			 address=s.next();
			System.out.println("Contact Number");
			contact=s.nextInt();
			System.out.println("E-Mail ID");
			mail=s.next();
			System.out.println("Enter proof type");
			prooftype=s.next();
			System.out.println("Enter proof id");
			 proofid=s.nextInt();
			System.out.printf("Thank you for registering.Your id is %d",i);
			i++;
			System.out.println("Do you want to continue registration(y/n)?");
			 pro=s.next();
			
		}while(pro.equals("y"));
		if(pro.equals("n")) {
			System.out.println("Do you want to update email");
			po=s.next();
			if(po.equals("yes")) 
			{
				System.out.println("Update email");
				System.out.println("Enter new email id");
				 String email = s.next();
				 System.out.println("email updated");
				 g.show(name,address,contact,email,prooftype,proofid);
				
			}
			else
				g.update(name,address,contact,mail,prooftype,proofid);
			}

	}

}
interface one{
	public void show(String name,String address,int contact,String email,String prooftype,int proofid);
	
}
interface newone{
	public void update(String name,String address,int contact,String mail,String prooftype,int proofid);
	
}
class Guest1 implements one,newone{

	public void show(String name,String address,int contact,String email,String prooftype,int proofid) {
		System.out.println("Your details are as follows");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+contact);
		System.out.println("E-Mail ID:"+email);
		System.out.println("Proof Type:"+prooftype);
		System.out.println("Proof id:"+proofid);
		
		
	}

	
	public void update(String name,String address,int contact,String mail,String prooftype,int proofid)
	{
		System.out.println("Your details are as follows");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact Number:"+contact);
		System.out.println("E-Mail ID:"+mail);
		System.out.println("Proof Type:"+prooftype);
		System.out.println("Proof id:"+proofid);
		

		
	}
	
}