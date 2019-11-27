package Inheritance;
import java.util.Scanner;
public class Singleinheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the car speed");
		int a=s.nextInt();
		Car3 c=new Car3();
		c.name();
		c.about();
		c.speed(a);

	}

}


