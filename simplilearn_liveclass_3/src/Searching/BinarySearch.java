package Searching;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2,6,4,8,10};
		Arrays.sort(arr);
		
		for(int value : arr) {
			System.out.print(value + ",");
		}
		
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 12));
		
		binarySearchAlgo(arr, 0, 14, arr.length-1);
		
	}
	
	public static void binarySearchAlgo(int arr[], int start , int key , int length) {
		
		int mid = (start + length) / 2;

		while(start <= length){
			if(arr[mid] == key) {
				System.out.println("Element Found");
				break;
			}else if(arr[mid] < key){
				start = mid + 1;
			}else {
				length = mid-1;
			}
			mid = (start+length)/2;
		}
		
		if(start > length) {
			System.out.println("Not found");
		}
	}

}
