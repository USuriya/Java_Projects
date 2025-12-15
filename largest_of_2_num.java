package PREP_PACKAGE;

import java.util.*;
import java.io.*;
public class largest_of_2_num {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter 1st number : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd number : ");
		double num2 = sc.nextDouble();
		String result = (num1>num2)?+num1+ "  is greater":+num2+"   is greater";
		System.out.println(result);
		
	}


}
