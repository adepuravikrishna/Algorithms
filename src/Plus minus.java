import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=0,count1=0,count2=0,count3=0;
        for(i=0;i<n;i++)
        {
         a[i]=sc.nextInt();   
        }
        for(i=0;i<n;i++)
         {
            int count=0;
           if(a[i]<0)
               {
               count1=count1+1;
           }
            if(a[i]>0)
                 {
                count2=count2+1;
              
           }
            if(a[i]==0)
                {
                   count3=count3+1;
               
            }
                
        }
        // System.out.println(n);
         System.out.println((float)count2/n);
         System.out.println((float) count1/n);
         System.out.println((float)count3/n);
        
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}