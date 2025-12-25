package arrays;

import java.util.*;
public class array_element_insertion {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			
			System.out.println("Enter element "+(i+1));
			int array_elements = sc.nextInt();
			arr[i] = array_elements;
			System.out.println();
		}
		System.out.println("The array elements are : "+(Arrays.toString(arr)));
	}
}
