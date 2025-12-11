package github_projects;

import java.io.*;
import java.util.*;
public class Aritmetic_Operations {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Select your choice : \n\t\t\t 1.Addition \n\t\t\t 2.Subtraction \n\t\t\t 3.Multiplication \n\t\t\t 4.Division \n\t\t\t 5.Modulus ");
		int choice = sc.nextInt();
		
		
		if(choice>=1 && choice<=5) {
			
			  System.out.print("\n\t\t Enter 1st number : ");
	            int num1 = sc.nextInt();
	            
	            System.out.print("\n\t\t Enter 2nd number : ");
	            int num2 = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("\n\t\t"+num1 + " + "+num2+" = "+(num1+num2));
			break;
			
		case 2:
			System.out.println("\n\t\t"+num1 + " - "+num2+" = "+(num1-num2));
			break;
			
		case 3:
			System.out.println("\n\t\t"+num1 + " x "+num2+" = "+(num1*num2));
			break;
			
		case 4:
			System.out.println("\n\t\t"+num1 + " / "+num2+" = "+(num1/num2));
			break;
			
		case 5:
			System.out.println("\n\t\t"+num1 + " % "+num2+" = "+(num1%num2));
			break;

		default:
			break;
		}
		}
		else {
			System.out.println("\n\t\t INVALID - OPTION");
		}
		
	}
}
