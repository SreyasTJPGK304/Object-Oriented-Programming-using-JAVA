package Interface;
import java.util.Scanner;
public class Interface1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student1 s1=new Student1();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter id");
		int id=s.nextInt();
		System.out.println("Enter marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int t=m1+m2+m3+m4+m5/5;
		s1.show(name,id);
		s1.total(t);

	}

}
interface rank{
	public void show(String name,int id);
	
	
}
interface total{
	public void total(int t);
	
}


 class Student1 implements rank,total{

	public void show(String name, int id) {
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		
	}

	public void total(int t) {
		System.out.println("Total:"+t);
		if(t>450) {
			System.out.println("Rank1");
		}
		else if(t<450 && t>400) {
			System.out.println("Rank 2");
		}
		else if(t<400 && t>350) {
			System.out.println("Rank 3");
		}
		else {
			System.out.println("Fail");
		}
		
	}

	
	
	
}
