package polymorphism;
import java.util.Scanner;
public class Polymorph3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		People p=new People();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter age");
		int age=s.nextInt();
		p.show(name,age);
		p.show(age);

	}

}
class People{

	public void show(String name, int age) {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		
	
	}

	public void show(int age) {
		if(age>50) {
			System.out.println("Old");
		}
		else if(age<50 && age>40)
		{
			System.out.println("middle age");
		}
		else if(age<40 && age>20) {
			System.out.println("Youth");
		}
		else {
			System.out.println("Child");
		}
		}
		
	}

