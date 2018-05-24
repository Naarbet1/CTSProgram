package com.oopsbased.program;

public class EvenNumber {
	public static void main(String[] args) {
		int A = 2, i;

		for (i = 1; i < 20; i++) {
			if(A % 2 == 0) {
				System.out.println(+A);
			}
			A++;
		}
	}

}
