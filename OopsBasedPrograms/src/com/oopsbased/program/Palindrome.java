package com.oopsbased.program;

public class Palindrome {
	public String palind(int n) {
		int reverse = 0, rem;
		int original=n;
		while (n > 0) {
			rem = n % 10;
			reverse = (reverse * 10) + rem;
			
			n=n/10;
		}	
	if (original == reverse)
		return "This is a Palindrome";
	else
		return "This is NOT a Palindrome";
	}

}
