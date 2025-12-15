package PREP_PACKAGE;

import java.util.*;
import java.io.*;
public class fizz_buzz {

	// if number divide only by 3 --- fizz
	// 					divide only by 5 -- buzz
	// if number divide by both 3 & 5 -- fizzbuzz
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		 if(num%3==0 && num%5==0) {
				System.out.println("FIZZ-BUZZ");
			}

		else if (num%3==0) {
			System.out.println("FIZZ");
		}
		else if(num%5==0) {
			System.out.println("BUZZ");
		}
		
	}
}
