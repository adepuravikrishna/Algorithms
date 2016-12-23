import java.util.HashMap;

public class Nonrepeating {
	public static void main(String[] args)
	{
		String s="ravikrishna";
		char[] c= s.toCharArray();
		HashMap<Integer,Character> hs= new HashMap<Integer,Character>();
		for(int i=0;i<c.length;i++)
		{
			if(hs.containsValue(c[i]))
			{
				System.out.println(c[i]);
			}
			hs.put(i, c[i]);

		}

	}

}
