package com.adepu.ravikrishna;


public class MoveAlphabetsLeft {
	public static void main(String args[]){

		String s="a12c334aaabb1";

		char[] ch=s.toCharArray();
		int index = 0;
		for(int i = 0; i < ch.length; i++)

		{

			if(Character.isAlphabetic(ch[i]))

			{

				char temp = ch[index];

				ch[index] = ch[i];

				ch[i] = temp;

				index++;

			}

		}

		System.out.println(ch);

	}


}
