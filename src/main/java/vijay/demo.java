package vijay;

public class demo {

	public static void main(String[] args) {
		int x=15;
		int y=1;
		try {
			System.out.println("x/y:"+x/y);
			System.out.println("x*y:"+x*y);
		}catch(ArithmeticException ae) {
			System.out.println("an Exception occured:"+ae);
		}
	}

}
