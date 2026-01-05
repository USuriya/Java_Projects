package arrays;

import java.util.*;
public class arrays_sorted_or_not {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of an array :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			int element = sc.nextInt();
			arr[i] = element;
		}
		System.out.println("Array --> "+Arrays.toString(arr));
		
		boolean ascending = true; boolean descending = true;
		for (int j = 0; j < arr.length-1; j++) {
			
			if (arr[j] < arr[j + 1]) {
				descending = false;
			} 
			else if (arr[j] > arr[j + 1]) { 
				ascending = false; 
			}
			
		}
		if (ascending) {
			System.out.println("Array is sorted in Ascending Order."); 
		}
		else if (descending) 
		{
			System.out.println("Array is sorted in Descending Order."); 
		} 
		else { 
			System.out.println("Array is not sorted.");
			}
		
	}
}
