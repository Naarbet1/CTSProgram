package com.oopsbased.programstest;

import com.oopsbased.program.PrimeOrNot;
import com.oopsbased.program.RangePrimeNumber;

public class PrimeOrNotTest {
	public static void main(String[] args) {
	
		PrimeOrNot primeOrNot = new PrimeOrNot();
		System.out.println(primeOrNot.isPrime(20));
		RangePrimeNumber NumberRange=new RangePrimeNumber();
		NumberRange.PrimeNoRange(20);
	}
}
