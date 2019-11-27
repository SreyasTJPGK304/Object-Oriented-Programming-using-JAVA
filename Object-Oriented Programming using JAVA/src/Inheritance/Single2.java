package Inheritance;
import java.util.Scanner;
public class Single2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("rollno");
		int n=s.nextInt();
		Students c=new Students();
		c.name();
		
		c.marks();
		c.rollno(n);
	}

}
