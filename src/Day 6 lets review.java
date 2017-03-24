import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        
        scan.nextLine();
      while(scan.hasNext())
          {
          StringBuffer s1= new StringBuffer();
          StringBuffer s2= new StringBuffer();
          String s= scan.nextLine();         
          for(int i=0;i<=s.length()-1;i++)
              {
              char c= s.charAt(i);
              if(i%2==0)
                  s1.append(c);
              else
                  s2.append(c);
                  
          }
          System.out.println(s1+" "+s2);      
      }
    }
}