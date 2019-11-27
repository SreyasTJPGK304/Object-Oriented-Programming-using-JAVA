package Inheritance;
import java.util.Scanner;
public class Multilevel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed");
		int n=s.nextInt();
		Model m=new Model();
		m.name();
		m.about();
		m.color();
		m.model();
		m.speed(n);

	}

}
