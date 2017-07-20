package com.adepu.ravikrishna.recursion;

public class WordSearch {
	public static void main(String[] args)
	{
		int[][] g={
				{'A','B','C','E'},
				{'S','F','C','S'},
				{'A','D','E','E'}
		};
		String s="CE";
		boolean yo= FindWord(g,s);
		System.out.println(yo);
		
		
	}

	private static boolean FindWord(int[][] g, String s) {
	
		int count=0;
		for(int i=0;i<=g.length;i++){
			for(int j=0;j<=g.length;j++){
				System.out.println("Now Checking g["+i+"]["+j+"] && current character "+Character.toString ((char) g[i][j]));
				if(s.indexOf(g[i][j])>0){
					count+=1;
					System.out.println("found "+Character.toString ((char) g[i][j]));
				}
			}
		}
		if(s.length()==count){
			return true;
			
		}
		
		return false;
	}

}
