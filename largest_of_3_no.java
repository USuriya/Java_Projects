package PREP_PACKAGE;

import java.util.*;
import java.io.*;
public class largest_of_3_no {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 1st number : ");
		int num2= sc.nextInt();
		System.out.println("Enter 1st number : ");
		int num3 = sc.nextInt();
		
		int result = num1>num2 ? (num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println(result);
		
	}

}
