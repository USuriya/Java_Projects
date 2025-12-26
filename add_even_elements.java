package arrays;

import java.util.*;
public class add_even_elements {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter "+(i+1)+" element : ");
			int element = sc.nextInt();
			arr[i] = element;
			
		
			if(arr[i] %2 ==0) {
				sum+=arr[i];
			}
			
		}
		System.out.println(" Array elements --> "+Arrays.toString(arr));
		System.out.println("sum of even elements -- > "+sum);
		
	
	}
}
