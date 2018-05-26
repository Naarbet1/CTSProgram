package com.niit.spring.programstest;

import com.niit.spring.programs.StringPrograms;

public class StringProgramTest {
	public static void main(String[] args) {
		// Compare Two String
		StringPrograms string = new StringPrograms();
		String s1= new String("Hello");
		String s2= new String("Hello");
		System.out.println(string.isEquals(s1,s2));
		System.out.println(string.isEquals("Xavier's 1st Laptop", "Xavier's 1st Laptop"));
		System.out.println(string.isEquals("Xavier's Laptop", "Xavier's laptop"));
		// Reversing string
		/*	System.out.println(string.toReverseString("reivaX tebraaN"));
		System.out.println(string.toReverseString("reivaX tebraaN 1"));
		// Palindrome or Not
		System.out.println(string.palindromeOrNot("SOS"));
		System.out.println(string.palindromeOrNot("xavier"));
		// Counting number of characters
		System.out.println(string.countNumberberInStrings("Hi , Hello take next 500m to Reach 5Th Avenue and You will find 5 doors"));
		// Counting the lower case letters
		System.out.println(string.countLowerCase("500 Rs ,Worth Watch"));
		// Counting No Of Spaces Between Words
		System.out.println(string.noOfSpaceInString("My name 12  "));
		// Counting No of Words
		System.out.println(string.noOfWords("My Name is Xavier."));*/
		// Remove Extra Strings
	System.out.println(string.removeExtraSpace("My  Name             is Xavier."));
	
	}
}
