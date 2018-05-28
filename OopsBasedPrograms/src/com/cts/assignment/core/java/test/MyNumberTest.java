package com.cts.assignment.core.java.test;

import com.cts.assignment.core.java.MyNumber;

public class MyNumberTest {
	public static void main(String[] args) {
		MyNumber addition = new MyNumber();
		System.out.println(addition.toAdd(3, 23));
		System.out.println(addition.toAdd(addition.toAdd(3, 23), 4));
		System.out.println(addition.toAdd(addition.toAdd(3, 23), addition.toAdd(3, 23)));
		
		MyNumber numberInRange=new MyNumber();
		numberInRange.inRange(100, 200);
		
		MyNumber numberToWord=new MyNumber();
	    System.out.println(numberToWord.numberToWord(490));
	    
	    MyNumber table=new MyNumber();
		table.tables(2);
		
		MyNumber grade=new MyNumber();
		System.out.println(grade.average(100,100, 70));
		
		MyNumber mark= new MyNumber();
		System.out.println(mark.grade(20, 100, 100));
		
		MyNumber toGetSumOfDigits = new MyNumber();
		System.out.println(toGetSumOfDigits.luckyNo(663));
		
		MyNumber factNo = new MyNumber();
		System.out.println(factNo.factorial(4));
		
		int ncr, n = 4, r = 4;
		System.out.println(ncr = factNo.factorial(n) / (factNo.factorial(r) * factNo.factorial(n - r)));
		
		MyNumber biggest = new MyNumber();
		System.out.println(biggest.isBig(10, 20));
		
		MyNumber evenOrOdd = new MyNumber();
		System.out.println(evenOrOdd.isEvenOrOdd(27));
		
		MyNumber palindromee = new MyNumber();
		System.out.println(palindromee.isPalindrome(122221));
		
		MyNumber primeOrNot = new MyNumber();
		System.out.println(primeOrNot.isPrime(20));
		
		MyNumber NumberRange=new MyNumber();
		NumberRange.PrimeNoRange(20);
		
		MyNumber revNo=new MyNumber();
		System.out.println(revNo.reverseNo(456));
		
	}

}
