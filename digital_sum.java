package PREP_PACKAGE;

import java.io.*;
import java.util.*;
public class digital_sum {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a  number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum =0;
		int last =0;
		while(num>0) {
			last= num%10;
			sum+=last;
			num/=10;
		}
		System.out.println("Digital Sum of " + temp +" is  : "+sum);
	}
}