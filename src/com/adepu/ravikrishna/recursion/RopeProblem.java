package com.adepu.ravikrishna.recursion;

public class RopeProblem {
	public static void main(String[] args){
		int len=9;
		int n= maxProd(10);
		System.out.println(n);
		int j=maxProdecursion(10);
		System.out.println(j);
		
		
	}

	private static int maxProd(int n) {
		 int[] val=new int[n+1];
		   val[0] =0;
		   val[1] = 0;
		  
		   // Build the table val[] in bottom up manner and return
		   // the last entry from the table
		   for (int i = 1; i <= n; i++)
		   {
		      int max_val = 0;
		      for (int j = 1; j <= i/2; j++)
		         max_val = max(max_val, (i-j)*j, j*val[i-j]);
		      val[i] = max_val;
		   }
		   return val[n];
		
		
	}
	static int maxProdecursion(int n)
	{
	    // Base cases
	    if (n == 0 || n == 1) return 0;
	 
	    // Make a cut at different places and take the maximum of all
	    int max_val = 0;
	    for (int i = 1; i < n; i++)
	      max_val = max(max_val, i*(n-i), maxProd(n-i)*i);
	 
	    // Return the maximum of all values
	    return max_val;
	}
	// Utility function to get the maximum of two and three integers
	static int max(int a, int b) { return (a > b)? a : b;}
	static int max(int a, int b, int c) { return max(a, max(b, c));}

}
