package com.oopsbased.program;

public class SumOfIndividualDigit {
	public int getSumOfDigits(int p) 
	{
		int sum = 0, rem;
		for (; p > 0;) {
			rem = p % 10;
			sum = sum + rem;
			p = p / 10;
		}
		return sum;
	}
}
