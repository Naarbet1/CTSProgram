package com.oopsbased.program;

public class PrimeOrNot {
	public boolean isPrime(int a) {
		if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
			if (a == 2 || a == 3 || a == 5 || a == 7) {
				return true;
			}
			return false;
		} else
			return true;
	}
	public static void main(String[] args) {
		PrimeOrNot prime = new PrimeOrNot();
		for(int i=2;i<200;i++)
		{
			if(prime.isPrime(i))
				System.out.println(i);
		}
	}
}
