package Sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,4,8,10};
		
		for(int i =0; i < arr.length-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < arr.length ; j++ ) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}	
			
			int temp = arr[min];
			
			
		}
		


	}
	
	

}
