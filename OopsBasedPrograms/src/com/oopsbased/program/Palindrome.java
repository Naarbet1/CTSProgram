package com.oopsbased.program;

public class Palindrome {
	//should return true or false.
	//method name should be like isPalindrome()
	public boolean isPalindrome(int n) {
		int reverse = 0, rem;
		int original=n;
		while (n > 0) {
			rem = n % 10;
			reverse = (reverse * 10) + rem;
			
			n=n/10;
		}	
	if (original == reverse)
		return true;
	else
		return false;
	}

}
