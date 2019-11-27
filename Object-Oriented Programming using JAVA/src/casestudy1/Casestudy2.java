package casestudy1;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		
			  int a;
			  Scanner s=new Scanner(System.in);
			  Bookng c=new Bookng();
			  String pro;
			  do {
				  System.out.println("Menu");
				  System.out.println("1)Book2)checkstatus3)Exit");
				  System.out.println("Enter your choice");
	int n=s.nextInt();
	switch(n) {
	case 1:
		c.book();
		break;
	case 2:
		c.checkstatus();
		break;
	case 3:
		System.exit(0);
	}
	pro=s.next();
			  }while(pro.equals("no"));
		
	}
			  
			 

			}

		

	


