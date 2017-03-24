import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0;
       for(i=0;i<n;i++)
           {
        for(j=0;j<=i;j++)
            {
                  if(j==0)
                  {
                 for(int k=0;k<n-i-1;k++)
                      System.out.print(" ");
                   }
            System.out.print("#");
            } 
       System.out.println();
       }
       }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
