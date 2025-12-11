package github_projects;


import java.util.*;
public class odd_or_even {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		double number = sc.nextDouble();
		System.out.println("Entered number is -> "+number);
		if(number>0) {
			if(number %2 ==0) {
				System.out.println(number+" is an even number ");
			}
			else {
				System.out.println(number+" is an odd number ");
			}
		}
	}

}
