import java.util.regex.Matcher;
import java.util.regex.Pattern;

class subset
{  
	  public static void main( String args[] )
      {
	String s1 = null,s2 = null;
 
    	 s1=args[0];
    	 s2=args[1];
     
      int i=0;
      Pattern p= Pattern.compile(s2);
      Matcher m= p.matcher(s1);
      while(m.find())
      {
    	 i++; 
      }
      System.out.println(i);
      }
}