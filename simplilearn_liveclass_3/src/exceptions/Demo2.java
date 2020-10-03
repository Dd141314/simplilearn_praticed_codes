package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo2 {
	
	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream(fileName);
	}
	
	public int customDivide(int x , int y) throws ArithmeticException{
		
		if(x<=0 || y<=0) {
			throw new ArithmeticException("Value cannot be Zero");
		}
		
		return x/y;
		
	}
	


}
