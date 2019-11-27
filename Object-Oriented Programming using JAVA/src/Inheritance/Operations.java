package Inheritance;
import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Number 1");
	int a=s.nextInt();
	System.out.println("Enter Number 2");
	int b=s.nextInt();
	System.out.printf("1)add\n2)sub\n3)mul\n4)div\n5)mod");
	int n=s.nextInt();
	Operation o=new Operation(a,b);
	switch(n) {
	case 1:
	Operation.add(a,b);
	break;
	case 2:
	Operation.sub(a,b);
	break;
	case 3:
	Operation.mul(a,b);
	break;
	case 4:
	Operation.div(a,b);
	break;
	case 5:
	Operation.mod(a,b);
	break;
	default:
		System.out.println("Invalid Input");
	}
	}
}
	
class Operation{
	int a,b;
	public Operation(int a,int b) {
		a=a;
		b=b;
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void div(int a,int b) {
		System.out.println(a/b);
	}
	public static void mod(int a,int b) {
		System.out.println(a%b);
	}
		
}

	


