package com.oopsbased.programstest;

import com.oopsbased.program.AddFunction;

public class AddFunctionTest {
	public static void main(String[] args) {
		AddFunction addition = new AddFunction();
		System.out.println(addition.add(3, 23));
		System.out.println(addition.add(addition.add(3, 23), 4));
		System.out.println(addition.add(addition.add(3, 23), addition.add(3, 23)));
	}

}
