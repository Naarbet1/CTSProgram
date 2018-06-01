var sum=function add(x,y)
{
return x+y;
}
console.log(sum(56,88)); 
var big = function isBig(a,b) {
		if (a > b)
			return a;
		else
			return b;
	}
console.log(big(56,88)); 
var EvenOdd=function isEvenOrOdd(c) {
		if (c % 2 == 0)
			return true;
		else
			return false;
	}
console.log(EvenOdd(17));
var primeOrNot =function isPrime(a) {
		if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
			if (a == 2 || a == 3 || a == 5 || a == 7) {
				return true;
			}
			return false;
		} else
			return true;
	}
console.log(primeOrNot(51));
var Range =function inRange( Start, Finish) {
		for (; Start <= Finish; Start++) {
			window.print(+Start + " ");
		}
	}
console.log(inRange(51));
var Palindrome=function isPalindrome( n) {
		var reverse = 0, rem;
		var original = n;
		while (n > 0) {
			rem = n % 10;
			reverse = (reverse * 10) + rem;
			n = n / 10;
		}
		if (original == reverse)
			return true;
		else
			return false;
	}

	// what is num and val??
	// Why two parameters?
	public String numberToWord(int number) {
		String Word = " ";
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
			number = number % 100;
		}
		if (number > 19 && number % 100 < 100) {
			Word += tens[number / 10];
			Word += ones[number % 10];
		} else
			Word += ones[number];
		return Word;
	}

	public void tables(int a) {
		int b = 0, c = 1;
		for (; b < 11; b++) {
			c = a * b;
			System.out.println(+a + "*" + b + "=" + c);
		}
	}

	// Switch method
	public String average(int x, int y, int z) {
		int Avg;
		Avg = (x + y + z) / 3;
		// Why this if condition??
		if (x > 40 && y > 40 && z > 40 && Avg <= 100) {
			switch (Avg / 10) {
			case 9:
				return "A+";
			case 8:
				return "A";
			case 7:
				return "A-";
			case 6:
				return "B+";
			case 5:
				return "B";
			// why so many return "FAIL" statements??
			}
		} else
			return "Fail";
		return "";
	}

	// If Else method
	public String grade(int m1, int m2, int m3) {
		float avg = (m1 + m2 + m3) / 3;
		if (m1 > 40 && m2 > 40 && m3 > 40) {
			if (avg <= 100) {
				if (avg >= 90) {
					return "A+";
				}
				// why to check with &&
				else if (avg >= 80) {
					return "A";
				} else if (avg >= 70) {
					return "A-";
				} else if (avg >= 60) {
					return "B+";
				} else if (avg >= 50) {
					return "B";
				} else {
					return "Fail";
				}
			} else
				return "Enter mark properly";
		} else
			return "Fail";
	}

	
		public int factorial(int a) {
			int b = 1;
			for (; a > 0; a--) {
				b = b * a;
			}
			return b;
		}

		public int luckyNo(int N) {
			{
				// what is p?
				// why sum1, sum2 variable?
				int sum = 0, rem;
				while (N > 0) {
					rem = N % 10;
					sum = sum + rem;
					N = N / 10;
					if (sum > 9 && N <= 0) {
						N = sum;
						sum = 0;
					}
				}
				return sum;
			}
		}

		// do not write main method
		// wrong logic.
		public void PrimeNoRange(int n) {
			for (int a = 2; a < 101; a++) {
				if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
					if (a == 2 || a == 3 || a == 5 || a == 7) {
						System.out.println(a);
					}
				} else {
					System.out.println(a);
				}
			}
		}

		public int reverseNo(int n) {
			int reverse = 0, rem;
			while (n > 0) {
				rem = n % 10;
				reverse = (reverse * 10) + rem;
				n = n / 10;
			}
			return reverse;
		}

		public void reverseOfNaturalNumbers() {
			for (int i = 10; i > 0; i--)
				System.out.println(+i);
		}

		public int getSumOfDigits(int p) {
			int sum = 0, rem;
			for (; p > 0;) {
				rem = p % 10;
				sum = sum + rem;
				p = p / 10;
			}
			return sum;
		}

		public void naturalNumbers(int j) {
			for (int i = 1; i < j; i++)
				System.out.println(+i);
		}

		public void isEven() {
			int i;
			// why to take another variable A?
			for (i = 1; i <= 20; i++) {
				if (i % 2 == 0)
					System.out.println(+i);
			}
		}
