package exceptions;

import java.io.FileNotFoundException;

public class Demo2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 demo2 = new Demo2();
		try {
			demo2.openFile("Dd.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			demo2.customDivide(10, -10);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

}
