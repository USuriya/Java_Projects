package PREP_PACKAGE;

import java.util.*;
import java.io.*;
public class character_type {

	
	// a-z or A-Z --> Letter
	// 0-9 --> number
	// $,@,#....--> special character
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a character : ");
		char character = sc.next().charAt(0);
		
		String result = ((character >'a'&character<'z') || character>'A' & character<'Z')?"letter":(character>='0'&character<='9')?"Number":"Special-Character";
		System.out.println(result);
	}
}
