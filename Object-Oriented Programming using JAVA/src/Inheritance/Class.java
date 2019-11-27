package Inheritance;
import java.util.Scanner;
public class Class {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String str=s.next();
		Carnew c=new Carnew(str);
		Carnew.a();
		Carnew.b();
		Carnew.m();
		Carnew.display(str);
	}
}
class Carnew{
	String str;
	public Carnew(String str) {
		str=str;
	}
	public static void m() {
		System.out.println("welcome car m");
	}
	public static void a() {
		System.out.println("welcome car a");
		
	}
	public static void b() {
		System.out.println("welcome car b");
	}
		


public static void display(String str) {
	System.out.println(str);
}

}	


