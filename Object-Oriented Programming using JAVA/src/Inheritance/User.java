package Inheritance;
import java.util.Scanner;
public class User {
	
	 
		Scanner s=new Scanner(System.in);
		static int booked[]=new int[25];
		String pro="";
		String con="";
		int sdate;
		int edate;
		int db;
		int i=1;
		int x=1;
			String ac,pr;
			String cot;
			String cable;
			String wifi;
			String laundry;
			
		    
		public void reg() {
      
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your address");
		String address=s.next();
		System.out.println("Contact Number");
		String contactNumber=s.next();
		System.out.println("E-Mail ID");
		String email=s.next();
		System.out.println("Prooftype");
		String Prooftype=s.next();
		System.out.println("Proof id");
		String proofid=s.next();
		
		System.out.printf("Thank you for registering.Your id is %d..\n",i);
		i=i+1;
		System.out.println("Do you want to book a room(y/n)?");
		pro=s.next();
		if(pro.equals("y")) {
			int total,b=0,c,d,e,f,i=1;
			do
			{
			System.out.println("Booking");
			System.out.println("Please choose the servise requested");
			System.out.println("AC/non-AC(AC/nAC)");
			ac = s.next();
			if(ac.equals("AC")==true)
			{
			b=1000;
			}
			else
			{
			b=750;
			}
			System.out.println("single cot or double cot");
			cot = s.next();
			if(cot.equals("single")==true)
			{
			c=0;
			}
			else
			{
			c=350;
			}
			System.out.println("with cable connection/without cable connection(C/nC)");
			cable = s.next();
			if(cable.equals("C")==true)
			{
			d=50;
			}
			else
			{
			d=0;
			}
			System.out.println("wifi needed or not(W/nW)");
			wifi = s.next();
			if(wifi.equals("W")==true)
			{
			e=200;
			}
			else
			{
			e=0;
			}
			System.out.println("laundry servise needed or not(L/nL)");
			laundry = s.next();
			if(laundry.equals("L")==true)
			{
			f=100;
			}
			else
			{
			f=0;
			}
			System.out.println("Enter the date of booking");
			db=s.nextInt();
			total= b+c+d+e+f;
			System.out.println("The total charge is Rs:"+total);
			System.out.println("The services chosen are");
			if(b==1000)
			{
			System.out.println("AC");
			}
			else
			{
			System.out.println("non-AC");
			}
			if(c==0)
			{
			System.out.println("single cot");
			}
			else
			{
			System.out.println("double cot");
			}
			if(d!=0)
			{
			System.out.println("cable connection enabled");
			}
			else
			{
			System.out.println("cable connection not enabled");
			}
			if(e!=0)
			{
			System.out.println("wifi enabled");
			}
			else
			{
			System.out.println("wifi not enabled");
			}
			if(f!=0)
			{
			System.out.println("with laundry services");
			}
			else
			{
			System.out.println("without laundry services");
			}
			System.out.println("Do you want to proceed");
			pr = s.next();
			}while(pr.equals("no"));
			if(pr.equals("yes")==true)
			{
			booked[x]=1;
			System.out.println("Thank you for booking.Your room number is "+x);
			x=x+1;
			}
		}
			System.out.println("Do you want to continue registration?(yes/no)");
			con=s.next();
			if(con.equals("yes")==true) {
				reg();
			}else {
				System.out.println("View all bookings");
				
			}
			System.out.println("Enter the start date");
			sdate=s.nextInt();
			System.out.println("Enter the end date");
			edate=s.nextInt();
			System.out.printf("The bookings made from %d to %d are\n",sdate,edate);
			System.out.println("Room number\t\tCustomer id");
			System.out.printf("%d  %d",x,i);
			}
		
	}
	

