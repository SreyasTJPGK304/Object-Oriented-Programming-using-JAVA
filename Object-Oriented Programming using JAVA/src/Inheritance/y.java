package Inheritance;

public class y {

}
Scanner s=new Scanner(System.in);
String name;
String address;
String contactNumber;
String email;
String proofType;
String proofId;
System.out.println("Registration");
System.out.println("Enter your name");
name=s.nextLine();
System.out.println("Enter your address");
address=s.nextLine();
System.out.println("Contact Number");
contactNumber=s.nextLine();
System.out.println("E-Mail ID");
email=s.nextLine();
System.out.println("Enter proof type");
proofType=s.nextLine();
System.out.println("Enter proof id");
proofId=s.nextLine();
Customer c=new Customer(name,address,contactNumber,email,proofType,proofId);
Customer.register(name,address,contactNumber,email,proofType,proofId);
}
}
class Customer{
String name;
String address;
String contactNumber;
String email;
String proofType;
String proofId;

public Customer(String name,String address,String ContactNumber,String email,String proofType,String proofId){
this.name=name;
this.address=address;
this.contactNumber=contactNumber;
this.email=email;
this.proofType=proofType;
this.proofId=proofId;
}
public static void register(String name,String address,String contactNumber,String email,String proofType,String proofId){
System.out.println("Customer Details");
System.out.println(name);
System.out.println(address);
System.out.println(contactNumber);
System.out.println(email);
System.out.println(proofType);
System.out.println(proofId);
System.out.println("Thank you for registering. Your id is 1...");
}
