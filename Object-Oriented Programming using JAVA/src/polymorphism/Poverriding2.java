package polymorphism;
import java.util.Scanner;
public class Poverriding2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ten ob=new ten();
		ob.display();

	}

}
class ten extends one{

	public void display() {
		super.display();
		System.out.println("Child Class");
		
	}
	
}
class one{

	public void display() {
		System.out.println("Parent Class");
		
	}
	
}
