package Inheritance;
import java.util.Scanner;
public class Hierarchial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Student id");
		int a=s.nextInt();
		System.out.println("Staff id");
		int b=s.nextInt();
		Stud d=new Stud();
		Staff f=new Staff();
		f.collegename();
		d.studentname();
		d.studentid(a);
		f.staffname();
		
		f.staffid(b);
		

	}

}
