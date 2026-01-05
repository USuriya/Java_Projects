package arrays;

import java.util.*;
public class array_largest_and_smallest {
	
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
		int min = arr[0];
		int max = arr[0];
		
		for (int j = 1; j < arr.length; j++) {
			if(arr[j] < min)
				min = arr[j];
			if(arr[j] > max)
				max = arr[j];
		}
		System.out.println("Smallest element --> "+min);
		System.out.println("Largest element ---> "+max);
		
		
		
	}

}
