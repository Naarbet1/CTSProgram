package com.oopsbased.program;

public class RangePrimeNumber {
	public static void main(String args[]) {
		
		for (int a = 2; a < 101; a++) {
			if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
				if (a == 2 || a == 3 || a == 5 || a == 7) {
					System.out.println(a);
				}

			} else {
				System.out.println(a);
			}

		}}}
