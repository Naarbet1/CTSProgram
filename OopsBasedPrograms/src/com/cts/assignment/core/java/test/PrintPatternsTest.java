package com.cts.assignment.core.java.test;

import com.cts.assignment.core.java.PrintPatterns;

public class PrintPatternsTest {
	public static void main(String[] args) {
		PrintPatterns printPattern=new PrintPatterns();
		printPattern.printStar(2, 3, 4);
		
		printPattern.numberPattern(5);
		printPattern.boxPattern(5,5);
	}

}
