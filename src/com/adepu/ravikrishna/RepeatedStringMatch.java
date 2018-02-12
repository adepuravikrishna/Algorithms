package com.adepu.ravikrishna;

public class RepeatedStringMatch {

	public static void main(String args[]){
	
	    String A = "abcd" ;
		String B = "cdabcdab";
		
		int count= findNumberOfTime(A,B);
		System.out.println(count);
		
	}

	private static int findNumberOfTime(String A, String B) {
		   int lengthA=A.length();
			int lengthB=B.length();
			int start= A.indexOf(B.charAt(0));
			int count=0;
	        
			StringBuilder s=new StringBuilder(A);
			while(start+lengthB>lengthA){
				lengthA=s.length();
			    s.append(A);
			    count++;			
			}
	         if(s.toString().contains(B)){
	              if(A.contains(B)){
				      return 1;
			      }
				return count;
			}else{
				return -1;
			}
		
		
		
	}
}
