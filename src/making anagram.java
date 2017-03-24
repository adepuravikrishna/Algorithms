import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String a, String b) {
    char[] arr1 = a.toCharArray();
  char[] arr2 = b.toCharArray();

  Arrays.sort(arr1);
  Arrays.sort(arr2);

  int i = 0, j=0; 
  int count = 0; 

  while(i < arr1.length && j < arr2.length){

   if(arr1[i] == arr2[j]){
    if(i<arr1.length)
     i++;
    if(j< arr2.length)
     j++;
   }
   else if( arr1[i] > arr2[j]){
    count++;
    j++;
   }
   else if(arr1[i] < arr2[j]){
    count++;
    i++;
   }

  }
  int total = (arr1.length -i)+(arr2.length - j)+ count;
    return total;
      
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    
    

}
