package steams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoClassWithoutStreams {

	public static void main(String[] args) {

		List<Integer> listOfInteger = new ArrayList<>(Arrays.asList(22,33,44,55,66));
		System.out.println("listOfInteger "+ listOfInteger);
		int sum = 0;
		for(Integer i : listOfInteger) {
			sum = sum + i;
		}
		
		System.out.println("Sum "+ sum);
				
		
		
	}

}
