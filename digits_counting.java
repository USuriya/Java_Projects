package PREP_PACKAGE;

import java.io.*;
import java.util.*;


public class digits_counting {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int count = 0;
		int temp = num;
		while(num>0) {
			num = num/10;
			count++;
		}
		System.out.println("Number of digits in "+ temp + " is "+ count);
	}
}
