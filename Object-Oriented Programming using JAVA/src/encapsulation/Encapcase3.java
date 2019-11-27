package encapsulation;
import java.util.Scanner;
public class Encapcase3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ticket g=new Ticket();
		int a;
		System.out.println("Enter price of a ticket:");
		g.setPrice(s.nextInt());
		System.out.println("Enter number of persons:");
		g.setNum(s.nextInt());
		a=g.getNum();
		int i=1,k=1;
		do {
			System.out.println("Enter details for person"+i);
			i++;
			System.out.println("Name:");
			g.setName(s.next());
			System.out.println("Gender(M or F)");
			g.setGender(s.next());
			System.out.println("Age:");
			g.setAge(s.nextInt());
			a--;
		}while(a>0);
			
			g.book(g.getPrice(),g.getNum());
			while(k<=g.getNum()) {
				double total=g.ticket1(g.getAge(),g.getGender(),g.getNum(),g.getPrice());

				if(k==g.getNum()) {

				System.out.printf("TOTAL AMOUNT=%.1f",total);
				break;
				}
				k++;
				}
				}

				
				
		
		

	}


class Ticket{
	int j=0,i=1;
	int price;
	int num;
	String name;
	String gender;
	int age;
	double total=0,sum=0;
	
	public int getPrice() {
		return price;
	}
	
	
	public void book(int price2, int num2, String name2, String gender2, int age2) {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void book(int num, int price) {
		System.out.printf("TICKET DETAILS ARE....\n");
		System.out.printf("NO: OF PASSENGERS:%d\n",num);
		System.out.printf("PRICE OF TICKET:%d\n",price);
		}
		
	public double ticket1(int age, String gender, int num, int price) {
		j++;
		total=0;
		double m=.25,o=.10,q=.50;
		
		if(age<16)
		{
		total=(int) ((double)sum+(price-(price*q)));
		sum=total;
		return total;
		}
		else if(gender.equals("F")==true && age>=16)
		{
		total=sum+(price-price*o);
		sum=total;
		return total;
		}
		else if(age>64)
		{
		total=sum+(price-price*m);
		sum=total;
		return total;
		}
		else
		{
		total=sum+price;
		sum=total;
		return total;
		}


	}
	}
	

