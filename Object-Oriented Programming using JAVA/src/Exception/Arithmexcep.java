package Exception;

public class Arithmexcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=5/0;
			System.out.println(num);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
			
		

	}

}
