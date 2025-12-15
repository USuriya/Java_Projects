package PREP_PACKAGE;

import java.io.*;
import java.util.*;
public class pos_neg_zero {

	// > 0 = positive
	//<0 = negative
	// ==0 = zero
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		double num = sc.nextDouble();
		if(num>0) {
			System.out.println(num +  " is a positive number.");
		}
		else if(num<0) {
			System.out.println(num +" is a negative number.");
		}
		else if(num ==0){
			System.out.println("It's a zero");
		}
	}
}
