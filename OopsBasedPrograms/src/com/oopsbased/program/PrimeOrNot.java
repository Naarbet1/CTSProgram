package com.oopsbased.program;

//wrong logic.
//what about 11, 13 and other prime numbers??
public class PrimeOrNot {
	//should return true or false
	//method name should bi like isPrime
	public int Prime(int a){
	if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0){
		return a;}else
	return 0;}
}
