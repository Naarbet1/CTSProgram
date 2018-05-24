package com.oopsbased.program;

import java.util.Scanner;
//Write generalized method
//no main method here.
public class MathTables {
	public static void main(String[] args) {
	long a,b=0,c;
	Scanner x=new Scanner(System.in);
	a=x.nextInt();
	for(;b<11;b++)
	{
		c=a*b;
		System.out.println(+a +"*" +b +"=" +c );
	}
	}
}
