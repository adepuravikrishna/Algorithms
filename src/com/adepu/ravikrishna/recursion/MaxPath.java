package com.adepu.ravikrishna.recursion;

public class MaxPath {
	public static void main(String[] args){
		int[][] grid= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
		};
		int sum=FindMaxPath(grid,0,0);
		System.out.println(sum);
			
	}

	private static int FindMaxPath(int[][] grid, int R, int D) {
		int down=0,right=0,n=grid.length;
		if(R==n-1 && D==n-1 ){
			System.out.println();
		return grid[R][D];	
		}
		if(R>=n || D>=n)
	    return Integer.MIN_VALUE;
		right= FindMaxPath(grid,R,D+1);
		down=FindMaxPath(grid,D+1,R);	
		System.out.print(grid[R][D]);
		return grid[R][D]+ Math.max(right, down);		
	}

}
