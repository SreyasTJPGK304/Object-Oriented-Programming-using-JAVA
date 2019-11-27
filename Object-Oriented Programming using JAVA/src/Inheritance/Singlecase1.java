package Inheritance;
import java.util.Scanner;
public class Singlecase1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of persons");
		int np=s.nextInt();
		System.out.println("Total number of days");
		int nt=s.nextInt();
		System.out.println("Room type");
		String rt=s.next();
		System.out.println("Tarrif per day");
		double taf=s.nextDouble();
		

		   SeasonBooking sb=new SeasonBooking();
		   sb.book(np,nt,rt,taf);
		   sb.total(np,nt,taf);


		}

		}
		class Member
		{
		public void book(int np,int nt,String rt,double taf)
		{
		System.out.println("Booking");
		System.out.printf("enter the number of persons:%d\n",np);
		System.out.printf("enter the number of days:%d\n",nt);
		System.out.printf("enter the roomtype:%s\n",rt);
		System.out.printf("enter the tarrif for single person:%f\n",taf);


		}
		 

		}
		class SeasonBooking extends Member
		{


		public void total(int np,int nt,double taf)
		{
		int y=(int) (np*nt*taf);
		System.out.printf("Total tarrif:%d",y);

		}

		}