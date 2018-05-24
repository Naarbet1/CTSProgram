package com.oopsbased.programstest;

import com.oopsbased.program.FactorialAndNcr;

public class FactorialAndNcrTest {
	public static void main(String[] args) {
		FactorialAndNcr factNo = new FactorialAndNcr();
		System.out.println(factNo.factorial(4));
		int ncr, n = 4, r = 4;

		System.out.println(ncr = factNo.factorial(n) / (factNo.factorial(r) * factNo.factorial(n - r)));

	}
}
