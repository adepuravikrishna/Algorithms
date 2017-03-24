import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i;
       int [] a= new int[n];
        //System.out.println(n);
        for(i=0 ; i<n ; i++) {
a[i]=sc.nextInt();
}
        for(i=0 ; i<n ; i++)
        {        
            sum=sum+a[i];
             
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
       
        System.out.println(sum); 
        
    }
}