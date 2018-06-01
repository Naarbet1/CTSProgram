package com.cts.assignment.core.java;

public class MyArray {
public int isbig(int A[])
{
	int max=A[0];
	int len=A.length;
	for(int i=0;i<len;i++)
	{
		if(A[i]>max)
		{
			max=A[i];
		}
	}
	return max;
}
public int getIndex(int A[])
{
	int max=A[0];
	int len=A.length;
	for(int i=0;i<len;i++)
	{
		if(A[i]>max)
		{
			max=i;
		}
	}
	return max;
}
public int toSum(int A[])
{
	int Sum=0;
	int len=A.length;
	for(int i=0;i<len;i++)
	{
		
			Sum=Sum+A[i];
		
	}
	return Sum;
}
public int linearSearch(int A)
{
	int len=a.length;
	for (int i=0;i<=len;i++)
	{
		if(A[i])
		{
			return i; 
		}
		else return 0;
	}
}
}
