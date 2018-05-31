var sum=function add(x,y)
{
return x+y;
}
//console.log(sum(56,88)); 
var big = function isBig(a,b) {
		if (a > b)
			return a;
		else
			return b;
	}
//console.log(big(56,88)); 
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


	
		
