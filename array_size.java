package arrays;

import java.util.*;
public class array_size {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Array lenght => "+arr.length);
		
	}
}
