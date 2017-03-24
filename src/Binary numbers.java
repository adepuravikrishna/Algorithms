import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         int r,count=0,temp=0;
       LinkedHashMap<String,Integer> hs= new LinkedHashMap<String,Integer>();
        while(n>0)
            {
            r=n%2;
            n=n/2;
            hs.put(Integer.toString(n),r);
        }
        for(String i:hs.keySet())
            {
           
           if( hs.get(i)==1)
               {
               count++;
           }
            else
                {
                if(temp<count)
                    {
               temp = count;
                }
                count=0;
                
            }
            
        }
        if(count>temp)
            {
            System.out.println(count); 
        }
        else{
            System.out.println(temp);
        }
      
    }
}
