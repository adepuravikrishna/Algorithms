import java.util.*;

public class  DectoBinary  {

    public static void main(String[] args) {
        
        int n = 6;
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
       System.out.println(temp);
    }
}


