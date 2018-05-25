package com.oopsbased.program;

//do not write main method
//wrong logic.
public class RangePrimeNumber {
	public void PrimeNoRange(int n) {
		for (int a = 2; a < 101; a++) {
			if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
				if (a == 2 || a == 3 || a == 5 || a == 7) {
					System.out.println(a);
				}

			} else {
				System.out.println(a);
			}

		}}}
