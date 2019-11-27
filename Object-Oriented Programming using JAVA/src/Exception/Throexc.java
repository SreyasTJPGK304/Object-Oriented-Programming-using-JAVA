package Exception;

public class Throexc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=12;
		if(a<b) {
			throw new ArithmeticException("B is greater");
		}
		else {
			throw new ArithmeticException("A is greater");
			
		}

	}

}
