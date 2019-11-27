package encapsulation;
import java.util.Scanner;
public class Encpas1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student1 st=new Student1();
		System.out.println("Enter name");
		st.setName(s.next());
		System.out.println("Enter id");
		st.setId(s.nextInt());
		System.out.println("Student Details");
		System.out.println(st.getName());
		System.out.println(st.getId());
		

	}

}
