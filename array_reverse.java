package arrays;

import java.util.*;
public class array_reverse {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Insert "+(i+1)+" element : ");
			int arr_elements = sc.nextInt();
			arr[i]=arr_elements;
			
		}
		System.out.println("Array elements are => "+(Arrays.toString(arr)));
		

		int[] rev = new int[arr.length];
		for (int j =arr.length-1; j >=0; j--) {
			rev[j]=arr[arr.length - 1 - j];;
			
		}
		System.out.println("Reversed array => "+Arrays.toString(rev));
	}
}
