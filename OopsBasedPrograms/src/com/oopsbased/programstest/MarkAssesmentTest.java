package com.oopsbased.programstest;

import com.oopsbased.program.MarkAssesment;

public class MarkAssesmentTest {

	public static void main(String[] args) {
	MarkAssesment grade=new MarkAssesment();
	System.out.println(grade.average(100,100, 70));
	MarkAssesment mark= new MarkAssesment();
	System.out.println(mark.grade(20, 100, 100));
	}

}