package PREP_PACKAGE;

import java.util.*;
import java.io.*;

public class second_largest_num {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd number : ");
		int num3 = sc.nextInt();
		
		int secondLargest =0;
        if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
            secondLargest = num1;
        } else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
            secondLargest = num2;
        } else {
            secondLargest = num3;
        }
        System.out.println(secondLargest +" is the second largest number.");
	}
}
