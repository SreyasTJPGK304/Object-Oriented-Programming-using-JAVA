package polymorphism;
import java.util.Scanner;
public class Bill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TelephoneBill tb=new TelephoneBill();
		GenerateBill gb=new GenerateBill();
		System.out.println("Enter the Telephone Bill Number");
		int tbill=s.nextInt();
		System.out.println("Enter the Customer Name");
		String name=s.next();
		System.out.println("Enter the number of calls made");
		int call=s.nextInt();
		System.out.println("Enter the cost per call");
		float cost=s.nextFloat();
		System.out.println("Enter the Current Bill Number");
		int cbill=s.nextInt();
		System.out.println("Enter the Customer Name");
		String name1=s.next();
		System.out.println("Enter the number of units consumed");
		int unit=s.nextInt();
		System.out.println("Enter the Cost per Unit");
		float cost1=s.nextFloat();
		tb.display(tbill,name,call,cost);
		gb.display(cbill,name1,unit,cost1);
		

	}

}
class TelephoneBill{

	public void display(int tbill, String name, int call, float cost) {
	        System.out.println("Bill Number:"+tbill);
	        System.out.println("Customer Name:"+name);
	        System.out.println("Telephone Bill Amount:"+(cost*call));
	        
		
	}
	
}
class GenerateBill extends TelephoneBill{
	public void display(int cbill, String name1, int unit, float cost1) {
	
		 System.out.println("Bill Number:"+cbill);
	        System.out.println("Customer Name:"+name1);
	        System.out.println("Telephone Bill Amount:"+(unit*cost1));
}
}
