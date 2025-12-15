package PREP_PACKAGE;

import java.io.*;
import java.util.*;
public class leap_year {
	
	// divide by 400
	// divide by 4 & not divide by 100
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		int leap = ((year%400 == 0) || (year %4 ==0 & year%100 !=0))? 1:0;
		String result = (leap == 1)?"leap year " : "not a leap year";
		System.out.println(result);
	}

}
