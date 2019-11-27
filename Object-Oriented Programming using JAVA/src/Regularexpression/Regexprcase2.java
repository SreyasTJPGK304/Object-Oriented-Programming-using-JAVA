package Regularexpression;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regexprcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";  //name validation
	      Pattern patName = Pattern.compile(regexName); //name validation
		
	      String lastName  =  "[A-Z]+([ '-][a-zA-Z]+)*";
	      Pattern patLname=Pattern.compile(lastName);
	      
	      
	      String regexEmail = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
			 Pattern pswEmail = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})");
			 Pattern patEmail = Pattern.compile(regexEmail);
	      
			 String regexNum = "^[0-9]*";
			 Pattern patNum = Pattern.compile(regexNum);
			 
			 String regexDep = "^[a-zA-Z.]*";
			 Pattern patDep = Pattern.compile(regexDep);
	      
	      
	      System.out.println("Enter Name");
		String name=s.next();
		Matcher nme=patName.matcher(name);
		
		System.out.println("Enter Last name");
		String lname=s.next();
		Matcher lnme=patLname.matcher(lname);
		
		
		System.out.println("Enter E-Mail ID");
		String email=s.next();
		Matcher mail=patEmail.matcher(email);
		
		System.out.println("Enter Reg.No");
		String reg=s.next();
		Matcher rg=patNum.matcher(reg);
		System.out.println("Enter Rank");
		String rank=s.next();
		Matcher rnk=patNum.matcher(rank);
		System.out.println("Enter year");
		String year=s.next();
		Matcher yr=patNum.matcher(year);
		System.out.println("Enter department");
		String dept=s.next();
		Matcher dpt=patDep.matcher(dept);
		
		if(nme.matches() && mail.matches() && rg.matches() && rnk.matches() && yr.matches() && dpt.matches()) {
			System.out.println("Enter Username");
			String username=s.next();
			Matcher mid=patEmail.matcher(username);
			System.out.println("Enter password");
			String password=s.next();
			Matcher pas=pswEmail.matcher(password);
			
			if(mid.matches()) {
				System.out.println("Valid Email ID");
			}
			else {
				System.out.println("Invalid email ID");
			}
			if(pas.matches()) {
				System.out.println("Valid password");
			}
			else {
				System.out.println("Incorrect Password");
			}

			
			
		}
		
		
		if(nme.matches()) {
			System.out.println("Name : "+name+ lname);
		}
		else {
			System.out.println("Invalid Name");
			
		}
		if(mail.matches()) {
			System.out.println("Email ID : "+email);
		}
		else {
			System.out.println("Invalid E-Mail ID");
		}
		if(rg.matches()) {
			
			System.out.println("Register Number : "+reg);
			
			
			
			
		}
		else {
			System.out.println("Invalid Register number");
		}
		
		if(rnk.matches()) {
			System.out.println("Rank : "+rank);
		}
		else {
			System.out.println("Invalid rank");
		}
		if(yr.matches()) {
			System.out.println("Year : "+year);
		}
		else {
			System.out.println("Invalid year");
		}
		if(dpt.matches()) {
			System.out.println("Department : "+dept);
		}
		else {
			System.out.println("Invalid Department");
		}
		
		
		
		
		
	}

}
