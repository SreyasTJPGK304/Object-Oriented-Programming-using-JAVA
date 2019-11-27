package abstraction;
import java.util.Scanner;
public class Abstract2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Stud sd=new Stud();
		System.out.println("Enter name");
	    String name=s.next();
	    System.out.println("Enter rollno");
	    int roll=s.nextInt();
	    System.out.println("Enter marks");
	    int m1=s.nextInt();
	    int m2=s.nextInt();
	    int m3=s.nextInt();
	    int m4=s.nextInt();
	    int m5=s.nextInt();
	    int total=m1+m2+m3+m4+m5;
	    float average=total/5;
	    sd.display(total,average);

	}

}
abstract class Ranks{
	abstract void display(int total,float average);
		public void rank(int total) {
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
	


class Stud extends Ranks{

	public void display(int total,float average) {
		System.out.println("Total:"+total);
		System.out.println("Average:"+average);
		super.rank(total);
	}
	
}
