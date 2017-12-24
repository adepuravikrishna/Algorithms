import java.io.*;
public class Solution {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    
    String s= "1?1?";
    wildChar(s,0);
}
    public static void wildChar(String s,int i)
        {
        char[] input=s.toCharArray();
        if(input.length==i)
            {
            System.out.println(s);
            return;
            
        }
        if(input[i] == '?')
{

input[i] = '0';

wildChar(input.toString(),i+1);
input[i] = '1';

wildChar(input.toString(),i+1);

input[i] ='?';

}
else{
wildChar(input.toString(),i+1);}
    }
}
