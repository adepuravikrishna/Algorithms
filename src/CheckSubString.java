
public class CheckSubString {
	public static void main(String[] args)
	{
		
	String a="abcbcglx";
	String b="bcgl";
	StringBuilder sb=new StringBuilder();
	
	char[] c= a.toCharArray();
	char[] c1=b.toCharArray();
	
	for(int i=0;i<c1.length;i++){
		
		for(int j=0;j<c.length;j++)
		{
			if(c1[i]==c[j])
			{				
				sb.append(c[j]);
				if(sb.length()==b.length()){
					System.out.println(sb.toString());
				}			
				
			}
		
		}
		
	}
	

	}

}
