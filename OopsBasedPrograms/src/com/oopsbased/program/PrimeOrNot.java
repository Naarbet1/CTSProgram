package com.oopsbased.program;
//wrong logic.
//what about 11, 13 and other prime numbers??
public class PrimeOrNot {
	//should return true or false
	//method name should bi like isPrime
	public boolean isPrime(int a) {
		if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
			if (a == 2 || a == 3 || a == 5 || a == 7) {
				return true;
			}
			return false;
		} else
			return true;
	}}
