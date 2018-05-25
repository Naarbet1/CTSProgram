package com.oopsbased.program;

public class LuckyNumber {
	public int luckyNo(int N) {
		{
			//what is p?
			//why sum1, sum2 variable?
			int sum = 0, rem;
			while ( N > 0) {
				rem = N % 10;
				sum = sum + rem;
				N = N / 10;

				if(sum>9&&N<=0){
					N=sum;
					sum=0;}	
			}
			return sum;
		}
	}

}
