import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonString {
	public static void main(String args[])
	{
		String[] s1={"ravi","vamshi","Adepu","chinna"};
		String[] s2={"vamshi"};
		findcommon(s1,s2);
		findcommonTwo(s1,s2);
	}

	private static void findcommonTwo(String[] s1, String[] s2) {
		System.out.println("doing second method");
		Set<String> s= new LinkedHashSet<String>(Arrays.asList(s1));
		s.retainAll(Arrays.asList(s2));
		System.out.println(s);
		
	}

	private static void findcommon(String[] s1, String[] s2) {
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i].equals(s2[j]))
			{
				System.out.println(s1[i]);
			}
		}
		
	}
		
	}

}
