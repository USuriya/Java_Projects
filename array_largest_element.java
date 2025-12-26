package arrays;

import java.util.*;
public class array_largest_element {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			int element = sc.nextInt();
			arr[i] = element;
		}
		int max = arr[0];
			for (int j = 1; j < size; j++) {
				if (arr[j]>max) {
					max = arr[j];
			}
			
		}
		System.out.println("Original array --> "+Arrays.toString(arr));
		System.out.println("Largest element is --> "+max);
	}
}
