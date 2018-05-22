package com.cts.assignmentprogrm;

public class PrimeNumber {
	public static void main(String args[]) {
		/*for (int a = 2; a < 101; a++) {
			if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
				if (a == 2 || a == 3 || a == 5 || a == 7) {
					System.out.println(a);
				}

			} else {
				System.out.println(a);
			}

		}*/
	/*	for(int i=2;i<=100;i++){
			if(number.checkPrime(i)==true){
				System.out.print(i+" ");
			}
		}
		public boolean checkPrime(int n){
			int count=0;
			for(int i=1;i<=n/2;i++){
				if(n%i==0){
					count++;
				}
			}
			if(count<=1){
				return true;
			}
			else
				return false;
		}*/
		for(int i=2;i<=100;i++){
			int count=0;
			for(int j=1;j<=i/2;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count<=1){
				System.out.print(i+", ");
				
	
				}
			}
		}
		}
