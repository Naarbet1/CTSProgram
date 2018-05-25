package com.oopsbased.program;

public class NumberToString {
	// what is num and val??
	// Why two parameters?
	public String numberToWord(int number) {
		String Word=" ";

		String ones[] = { " ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN",
				" ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN",
				" NINETEEN" };
		String tens[] = { " ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY",
				" NINETY" };
		String hundreds = " HUNDRENAND";

		if (number > 19 && number < 100) {
			Word = tens[number / 10];
			Word += ones[number % 10];
		}

		if (number >= 100 && number <= 999) {

			Word = ones[(number / 100)];
			Word += hundreds;
			number=number%100;}
			if (number > 19 && number%100 < 100) {
				
				Word+= tens[number/ 10];
				Word += ones[number % 10];
			}else 
				Word += ones[number];
			
			/*
			Word += tens[number / 100];
			Word += ones[number % 10];*/
		
		return Word;
		}
}
