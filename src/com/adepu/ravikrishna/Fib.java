package com.adepu.ravikrishna;

public class Fib {
	public static void main(String[] args)
	{
		int n= fib(6);
		System.out.println(n);		
	}

	private static int  fib(int i) {
	return i<=1?i:(i<=1?i:fib(i-1)+fib(i-2));
	}

}
