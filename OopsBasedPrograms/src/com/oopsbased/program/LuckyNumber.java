package com.oopsbased.program;

public class LuckyNumber {
	public int luckyNo(int p) {
		{
			//what is p?
			//why sum1, sum2 variable?
			int sum = 0,sum1=0,sum2, rem;
			while ( p > 0) {
				rem = p % 10;
				sum = sum + rem;
				p = p / 10;

				if(sum>9&&p<=0){
					p=sum;
					sum=0;}	
			}
			return sum;
		}
	}

}
