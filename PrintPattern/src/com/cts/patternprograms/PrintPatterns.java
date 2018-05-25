package com.cts.patternprograms;

public class PrintPatterns {
	public void printStar(int a, int c, int d) {
		int b, x, i, j;

		for (b = 1; b <= a; b++) {
			for (j = 1; j <= b; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		for (b = c; b > 0; b--) {
			for (j = b; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		x = d;
		d = d - 1;
		for (i = 1; i <= x; i++) {
			for (j = d; j > 0; j--)
				System.out.print(" ");
			d--;
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	public void numberPattern(int z) {
		int y, n, i, j;
		y = z;
		z = z - 1;
		for (i = 1; i <= y; i++) {
			for (j = z; j > 0; j--)
				System.out.print(" ");
			z--;
			n = 1;
			for (j = 1; j <= i; j++) {
				System.out.print(+n);
				n++;
			}
			System.out.println("");
		}

	}

	public void boxPattern(int l, int b) {
		for (int i = 1; i <= l; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == l) {
					System.out.print("-");
				} else {
					if (j == 1 || j == b) {
						System.out.print("|");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
