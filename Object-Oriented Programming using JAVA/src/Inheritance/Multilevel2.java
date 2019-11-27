package Inheritance;
import java.util.Scanner;
public class Multilevel2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the count");
		int n=s.nextInt();
		Child c=new Child();
		c.name();
		c.gender();
		c.relation();
		c.count(n);

	}

}
