package Inheritance;
import java.util.Scanner;
public class Hierarchialcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of persons");
		int p=s.nextInt();
		System.out.println("Total number of days");
		int t=s.nextInt();
		System.out.println("Tarrif per day");
		double ta=s.nextDouble();
		System.out.println("Room type");
		String r=s.next();
		System.out.println("month");
		        int m=s.nextInt();
		        int peakc=2;
		int di=25;
		Peakseason ps=new Peakseason();
		Leanseason ls=new Leanseason();
		   switch(m)
		{
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
		ls.bcd(p,t,r,m,di,ta);
		ls.lean(p,t,ta,di);
		break;
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
		ps.abc(p,t,r,m,peakc,ta);
		ps.peak(p,t,ta,peakc);
		break;
		}
		}
		}
		class Season
		{
		public void abc(int p, int t, String r,int m,int peakc,double ta)
		{
		System.out.println("Booking");
		System.out.printf("enter the number of persons:%d\n",p);
		System.out.printf("enter the number of days:%d\n",t);
		System.out.printf("enter the roomtype:%s\n",r);
		System.out.printf("enter the month:%d\n",m);
		System.out.printf("enter the peakcharge:%s\n",peakc);
		System.out.printf("enter the tarrif for single person:%s\n",ta);



		}
		public void bcd(int p, int t, String r, int m, int di, double ta)
		{
		System.out.println("Booking");
		System.out.printf("enter the number of persons:%d\n",p);
		System.out.printf("enter the number of days:%d\n",t);
		System.out.printf("enter the roomtype:%s\n",r);
		System.out.printf("enter the month:%d\n",m);
		System.out.printf("enter the discount:%s\n",di);
		System.out.printf("enter the tarrif for single person:%s\n",ta);
		}



		}
		class Peakseason extends Season
		{
		public void peak(int p,int t,double ta,int peakc)
		{
		       int totals=(int) (p*t*ta);
		       int tse=totals*peakc;
		       System.out.printf("Total tarrif:%d",tse);
		       

		    }

		}
		class Leanseason extends Season
		{
		public void lean(int p,int t,double ta,int di)
		    {
		   int total=(int) (p*t*ta);
		        int ts=total-(di*p*t);
		        System.out.printf("Total tarrif:%d",ts);
		    }




		}

	
	
	
	




