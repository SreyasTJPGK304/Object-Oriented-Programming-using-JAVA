package polymorphism;

import java.util.Scanner;

public class Vehicle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car c=new Car();
		Bike b=new Bike();
		
		System.out.println("1)Car");
		System.out.println("2)Bike");
		int n=s.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter the details of car");
			System.out.println("Enter the color");
			String color=s.next();
			System.out.println("Enter the maximum speed");
			int speed=s.nextInt();
			System.out.println("Enter the number of seats");
			int seat=s.nextInt();
			System.out.println("Enter the number of wheels");
			int wheel=s.nextInt();
			System.out.println("Enter the number of doors");
			int door=s.nextInt();
			System.out.println("Enter the status of AC(true/false");
			String status=s.next();
			c.details(color,speed,seat,wheel,door,status);
			break;
		case 2:
			System.out.println("Enter the details of bike");
			System.out.println("Enter the color");
			String color1=s.next();
			System.out.println("Enter the maximum speed");
			int speed1=s.nextInt();
			System.out.println("Enter the number of seats");
			int seat1=s.nextInt();
			System.out.println("Enter the number of wheels");
			int wheel1=s.nextInt();
			System.out.println("Enter the status of diskbreak(true/false)");
			String status1=s.next();
			
			b.details(color1,speed1,seat1,wheel1,status1);
			break;
			default:
				System.out.println("Invalid Option");
		}
	}
		
		
		

	

}
class Car{
	

	
	public void details(String color, int speed, int seat, int wheel, int door, String status) {
		System.out.println("Car Details");
		System.out.println("Color:"+color);
		System.out.println("Maximum Speed:"+speed);
		System.out.println("Number of Seats:"+seat);
		System.out.println("Number of Wheels:"+wheel);
		System.out.println("Number of Doors:"+door);
		System.out.println("Ac:"+status);
		
		
	}
	
}
class Bike extends Car{

	

	public void details(String color1, int speed1, int seat1, int wheel1, String status1) {
		System.out.println("Bike Details");
		System.out.println("Color:"+color1);
		System.out.println("Maximum Speed:"+speed1);
		System.out.println("Number of Seats:"+seat1);
		System.out.println("Number of Wheels:"+wheel1);
		
		System.out.println("Ac:"+status1);
		
	}

	
		
		
	}
	

