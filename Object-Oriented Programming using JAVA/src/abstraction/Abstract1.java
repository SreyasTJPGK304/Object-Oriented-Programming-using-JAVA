package abstraction;
import java.util.Scanner;
public class Abstract1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		st.totalmark();

	}

}

abstract class Rank{
	abstract void totalmark();
	public void rank1() {
		System.out.println("Rank 2");
	}
	
	
}



class Student extends Rank{

	public void totalmark() {
		super.rank1();
		System.out.println("Total mark -> 450");
		
	}
	
}

