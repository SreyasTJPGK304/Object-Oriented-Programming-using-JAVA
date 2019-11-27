package polymorphism;
import java.util.Scanner;
public class Poverriding1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ABC obj1=new ABC();
		obj1.disp();
		Demo obj=new Demo();
		obj.disp();

	}

}
class Demo extends ABC{

	public void disp() {
		System.out.println("Child Class");
		
	}
	
}
class ABC{
	public void disp() {
		System.out.println("Parent Class");
	}
	}


