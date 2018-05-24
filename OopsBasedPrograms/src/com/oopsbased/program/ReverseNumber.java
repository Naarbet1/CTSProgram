package com.oopsbased.program;

public class ReverseNumber {
	public int reverseNo(int n) {
		int reverse = 0, rem;
		while (n > 0) {
			rem = n % 10;
			reverse = (reverse * 10) + rem;
			n = n / 10;
		}
		return reverse;
	}

}