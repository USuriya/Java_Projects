package PREP_PACKAGE;

import java.util.*;
import java.io.*;
public class vowel_consonant_character {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a character : ");
		char character = sc.next().charAt(0);
		
		if((character >='a' && character<'z') ||(character>='A' && character<='Z')) {
		
			switch (character) {
			case 'a','e','i','o','u','A','E','I','O','U' -> {
				System.out.println(character+" is a Vowel");
			}
			default ->{
				System.out.println(character+ " is a Consonants");
			}
			}
		
		}
		else {
			System.out.println("Not a letter");
		}
	}

}
