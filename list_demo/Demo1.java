package list_demo;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Not mentioned the type 
		List list = new ArrayList();
		list.add("Dd");
		list.add(1);
		list.add(null);
		list.add("");
		list.add("Dd");
		System.out.println(list);
		
		//Integer type
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		System.out.println(integerList);
		
		//Overload concept behind the predefined methods
		integerList.add(1,1000);
		System.out.println(integerList);
		
		//Adding method inside the size of the list
		
		//integerList.add((integerList.size() + 1),2000);
		//System.out.println(integerList);
		//Above statement throw error
		
		 integerList.add(2000);
		 System.out.println(integerList);
		 
		 
		 //Reading the list value
		 System.out.println(integerList.get(1));
		 
		 for(int i = 0 ; i < integerList.size() ; i++) {
			 System.out.print(integerList.get(i) + ",");
		 }

		 //Update the list
		 integerList.set(2, 3000) ;
		 System.out.println(integerList);

		 //Delete the elements in the list
		 integerList.remove(0);
		 System.out.println(integerList);
		 
		 Integer i = 3000;
		 integerList.remove(i);
		 System.out.println(integerList);
		 
		 integerList.remove(0);
		 System.out.println(integerList);
		 
		 //If two values are same, It removes the value of the first occurance
		 
		 integerList.add(5000);
		 integerList.add(4000);
		 integerList.add(5000);
		 System.out.println(integerList);
		 
		 Integer i1 = 5000;
		 integerList.remove(i1);
		 System.out.println(integerList);
		 
		 integerList.add(5000);
		 integerList.add(5000);

		 // To delete all the value of the occurance
		 while(integerList.remove(i1)) {
			 System.out.println(integerList);
		 }
		 
		 integerList.add(5000);
		 integerList.add(5000);
		 System.out.println(integerList);
		 
		 System.out.println(i1);

		 int count = 0;
		 for(int j = 0 ; j < integerList.size(); j++) {
			 
			 if( integerList.get(j).equals(i1)) {
				 count = count + 1;
			 }
			 
			 /* Not working 
			  * It checks the memory 
			 if( integerList.get(j) == i1 ) {
				 count = count + 1;
			 }
			 */

		 }
		 System.out.println(count);



		
		 
		 

	}

}
