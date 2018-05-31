package com.cts.assignment.core.java;

public class Program {
	public static void main(String[] args) {
		float i, j, k, l;
		for (i = 1f; i < 20f; i++)
			for (j = 1f; j < 20f; j++)
				for (k = 1f; k < 20f; k++)
					for (l = 1f; l < 20f; l++)
						if ((i + j) == 8f && (k - j) == 6f && (i + k) == 13f && (j + l) == 8f)
							System.out.println(+i + " " + j + " " + k + " " + l);
	}
}
