package Inheritance;
import java.util.Scanner;

public class Studreport {
	
	 String name;
	 int rollno;

	public void detail(String name, int rollno) {
		this.name=name;
		this.rollno=rollno;
		
	}
	
     

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter rollno");
		int rollno=s.nextInt();
		System.out.println("Enter marks");
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		int l=s.nextInt();
		int m=s.nextInt();
		int total=i+j+k+l+m;
		int avg=i+j+k+l+m/5;
		Student n=new Student();
		n.detail(name,rollno);
		//n.mark();
		n.total(total);
		
		n.average(avg);
	
		
		
		
		
		
		
	}	

	}


