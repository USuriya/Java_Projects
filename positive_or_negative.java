package PREP_PACKAGE;

import java.io.*;
import java.util.*;
public class positive_or_negative {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
	
		String result = (num>0)?"positive_number":"negative_number";
		System.out.println(result);
	}

}
