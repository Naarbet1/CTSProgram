package com.cts.assignment.core.java.test;

import com.cts.assignment.core.java.MyArray;

public class MyArrayTest {

	public static void main(String[] args) {
		MyArray array=new MyArray();
		int a[]= {44,12,23,45};
		System.out.println(array.isbig(a));
		System.out.println(array.getIndex(a));
		System.out.println(array.toSum(a));

	}

}
