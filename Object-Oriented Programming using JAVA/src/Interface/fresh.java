package Interface;
import java.util.Scanner;
public class fresh {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Account a=new Account();
	    
	    String name=s.next();
	    int accountNumber=s.nextInt();
	    int accountBalance=s.nextInt();
	    String date=s.next();
	    int year=s.nextInt();
	     
	        int n=s.nextInt();
	    switch(n){
	      case 1:
	        a.show(name, accountNumber, accountBalance, date, year);
	        
	        break;
	      case 2:
	        a.display(name, accountNumber, accountBalance, date, year);
	        
	    }
	  }
	}
	        interface CurrentAccount{
	          public void show(String name,int accountNumber,int accountBalance,String date,int year);
	         
	          
	        }
	interface SavingsAccount{
	  public void display(String name,int accountNumber,int accountBalance,String date,int year);
	  
	}
	 class Account implements CurrentAccount,SavingsAccount{
	 
	 

	public void display(String name, int accountNumber, int accountBalance, String date, int year) {
		System.out.println("Name");
	    System.out.println("Account Number");
	    System.out.println("Account Balance");
	    System.out.println("Enter the Start Date(yy-mm-dd)");
	    System.out.println("Enter the Years");
	    System.out.println("Maintainence Charge For Savings Account 550.00");
		
	}
	@Override
	public void show(String name, int accountNumber, int accountBalance, String date, int year) {
		 System.out.println("Name");
		    System.out.println("Account Number");
		    System.out.println("Account Balance");
		    System.out.println("Enter the Start Date(yy-mm-dd)");
		    System.out.println("Enter the Years");
		     System.out.println("Maintainence Charge For Current Account 400.00");
		    
		
	}
	

	}


