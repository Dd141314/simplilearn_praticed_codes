package Searching;

public class LinearSearch {

	public static void main(String[] args) {
		String strArr[] = {"Dd","Ravi","Ram","Dd","Vadivelu"};
		String searchElement = "Ravi123";
		
		boolean searchResult = false;
		int occurances = 0;
		
		for(String string : strArr) {
			if(string.equals(searchElement)) {
				searchResult = true;
				occurances ++;
			}
			
		}
		
		if(searchResult) {
			System.out.println("Element Found Occurances := "+ occurances );
		}else {
			System.out.println(" Not Found");

		}

	}

}
