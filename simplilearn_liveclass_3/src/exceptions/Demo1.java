package exceptions;

public class Demo1 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		int result = 0;
		
		try {
			result = x/y;
			String s = null;
			System.out.println(s.length());
		}catch (ArithmeticException ae) {
			System.out.println("Not divided by zero");
		}catch (NullPointerException ne){
			System.out.println("String is null");
		}finally {
			System.out.println("Result is " + result);

		}
		
		//Catch is not mandatory
		try {
			System.out.println("Test");
		}finally {
			System.out.println("Test Code");
		}
		
		
	}

}
