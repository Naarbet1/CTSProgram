package com.cts.patternprogramstest;

import com.cts.patternprograms.PrintPatterns;

public class PrintPatternsTest {
	public static void main(String[] args) {
		PrintPatterns printPattern=new PrintPatterns();
		printPattern.printStar(2, 3, 4);
		
		printPattern.numberPattern(5);
		printPattern.boxPattern(5,5);
	}

}
