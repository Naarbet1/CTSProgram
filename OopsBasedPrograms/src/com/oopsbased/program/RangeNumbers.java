package com.oopsbased.program;

import java.util.Scanner;
//do not use main method OR scanner
public class RangeNumbers {
	public static void main(String[] args) {
		
	Scanner x=new Scanner(System.in);

	int A,y,B;
	A=x.nextInt();
	y=x.nextInt();
	B=y;
	for(;A<=B;A++){
		System.out.print(+A+" ");
	}
	
	}
}
