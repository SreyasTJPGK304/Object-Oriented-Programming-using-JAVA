package polymorphism;
import java.util.Scanner;
public class Polymorph2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stud st=new Stud();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter roll no");
		int roll=s.nextInt();
		System.out.println("Enter department");
		String dept=s.next();
		System.out.println("enter year");
		int year=s.nextInt();
		System.out.println("Enter marks");
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int m4=s.nextInt();
		int m5=s.nextInt();
		int total=m1+m2+m3+m4+m5;
		
		int avg=total/5;
		st.display(name,roll,dept,year);
		
		st.display(avg);
		st.display(m1,m2,m3,m4,m5,total);
		

	}

}
class Stud{

	public void display(String name, int roll, String dept, int year) {
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+roll);
		System.out.println("Department:"+dept);
		System.out.println("Year:"+year);
		
	}

	public void display(int avg) {
		System.out.println("Average:"+avg);
		
	}

	public void display(int m1, int m2, int m3, int m4, int m5,int total) {
		if(total>450) {
			System.out.println("Rank 1");
		}
		else if(total<450 && total>400) {
			System.out.println("Rank 2");
		}
		else if(total<400 && total>350) {
			System.out.println("Rank 3");
		}
		else if(total<350 && total>300) {
			System.out.println("Rank 4");
		}
		else {
			System.out.println("Fail");
		}
			
		}
		
	}


