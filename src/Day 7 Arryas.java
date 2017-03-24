import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] ar=new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();   
            
        }
        for(int i=0; i<=arr.length-1;i++)
            {
            ar[i]=arr[(arr.length -i)-1];
            System.out.print(ar[i]+" ");
        }
    
        
        in.close();
    }
}
