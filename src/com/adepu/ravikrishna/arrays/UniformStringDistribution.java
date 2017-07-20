package com.adepu.ravikrishna.arrays;

public class UniformStringDistribution {

	public static void main(String[] args)
	{
		String s="aaabbbbcccd";
		findMacCharposOcc(s);

	}

	private static void findMacCharposOcc(String s) {
		int count=0,maxcount=0,startPos=-1;
		char currentChar = 0,maxchar=0;
		if(s!=null){
			char ch[]= s.toCharArray();
			for(int i=0;i<ch.length;i++){
				if(currentChar!=ch[i]){
					currentChar=ch[i];
					if(maxcount<count){
						startPos=s.indexOf(ch[i-1]);
						maxcount=count;	
						maxchar=ch[i-1];
					}
					count=0;					
				}
				count++;								
			}

		}

		System.out.println("Starting position of a string: " + startPos);
		System.out.println("Occurance of a max Character: " + maxcount);
		System.out.println("Mach Char: " + maxchar);
		return;
		
	}

}
