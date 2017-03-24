import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        s=s.replaceAll(" ","");
        HashSet<Integer> hs= new HashSet<Integer>();
        s=s.toLowerCase();
        for(int i=0;i<=s.length()-1;i++)
            {
            char ch= s.charAt(i);
            int c=(int) ch;
            if( c>=97 && c<=122)
                {
                hs.add(c);
            }
        }
        
              
        if( hs.size()==26)
            {
            System.out.println("pangram");
        }
        else
            {
            System.out.println("not pangram");
        }
       
        
    }
}