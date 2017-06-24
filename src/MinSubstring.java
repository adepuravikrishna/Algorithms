import java.util.ArrayList;
import java.util.List;

public class MinSubstring {

	public static void main(String args[])
	{
		String s="abcdefghad";
		List<Character> l= new ArrayList<Character>();
		l.add('a');
		l.add('d');
		for(int i=0;i<s.length();i++){
			if(!l.isEmpty()){
			if(l.contains(s.substring(i)))
			{
		     int begin=i;
			 l.remove(s.substring(i));
			 //
			 
			}
			}
				
			
		}
		
		
				
		
	}
}
