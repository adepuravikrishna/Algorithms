import java.util.ArrayList;
import java.util.List;

public class Solution {
        static List<List<String>> resultLst;
	    static ArrayList<String> currLst;
	    public static void main(String [] args)
	    {
	    	String s= "abbracadabraa";
	    	resultLst= partition(s);
	    	for(List<String> r:resultLst){
	    		
	    		int i=0;
	    		StringBuilder sb = new StringBuilder();
	    		for(String a:r)
	    		{
	    			
	    			if(i<r.size()-1)
	    			sb.append(a+"|");
	    			else
	    				sb.append(a);
	    			
	    		}
	    		System.out.println(sb.toString());
	    		
	    	}
	    	
	    }
	    public static List<List<String>> partition(String s) {
	        resultLst = new ArrayList<List<String>>();
	        currLst = new ArrayList<String>();
	        backTrack(s,0);
	        return resultLst;
	    }
	    public static void backTrack(String s, int l){
	        if(currLst.size()>0 //the initial str could be palindrome
	            && l>=s.length()){
	                @SuppressWarnings("unchecked")
					List<String> r = (ArrayList<String>) currLst.clone();
	                resultLst.add(r);
	        }
	        for(int i=l;i<s.length();i++){
	            if(isPalindrome(s,l,i)){
	                if(l==i)
	                    currLst.add(Character.toString(s.charAt(i)));
	                else
	                    currLst.add(s.substring(l,i+1));
	                backTrack(s,i+1);
	                currLst.remove(currLst.size()-1);
	            }
	        }
	    }
	    public static boolean isPalindrome(String str, int l, int r){
	        if(l==r) return true;
	        while(l<r){
	            if(str.charAt(l)!=str.charAt(r)) return false;
	            l++;r--;
	        }
	        return true;
	    }
}