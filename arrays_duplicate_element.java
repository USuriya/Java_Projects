package arrays;

import java.util.*;
public class arrays_duplicate_element {

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
		
		
		boolean foundDuplicate = false; 
		for (int i = 0; i < arr.length; i++) {
			boolean alreadyPrinted = false; 
			for (int k = 0; k < i; k++) {
				if (arr[i] == arr[k]) { 
					alreadyPrinted = true; 
					break; } 
				} 
			if (alreadyPrinted) 
				continue; 
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) { 
					System.out.println("Duplicated element --> " + arr[i]); 
					foundDuplicate = true;
					break; 
					}
				} 
			} 
		if (!foundDuplicate) { 
			System.out.println("No duplicates found.");
			}
	}
}
