import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      
      char[] ch1=A.toLowerCase().toCharArray();
      char[] ch2=B.toLowerCase().toCharArray();
       
      Arrays.sort(ch1);
      Arrays.sort(ch2);
       if(Arrays.equals(ch1,ch2)){
        return true;
   }
       
          return false;//Complete the function
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
