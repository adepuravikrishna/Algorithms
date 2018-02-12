import java.util.HashSet;

public class TestRavi {
	public static void main(String[] args){
		String s="John Doe; Peter Benjamin Parker; Mary Jane Watson-Parker; John Elvis Doe; John Evan Doe; Jane Doe; Peter Brian Parker";
		String c="Example";
		String a=Solution(s,c);
		System.out.println(a);
		
	}
	public static String Solution(String S,String C){
		HashSet<String> hs=new HashSet<String>();
		StringBuilder sb=new StringBuilder();
		String[] sArray=S.split(";");
		for(String temp:sArray){
			String[] a=temp.split(" ");
			if(a.length==2){
				String first= a[0];
				String last=a[1];
				String ulti= first+" "+last+" "+"<"+first+"."+last;
				String tail=">"+"@"+C.toLowerCase()+"."+"com"+";";
				if(!hs.contains(ulti)){
					hs.add(ulti);
					sb.append(ulti+tail);	
				}else{
				sb= checkHashSet(hs,ulti,2,sb,tail);				
					
				}
				
			}else if(a.length>=3){
				String first= "";
				String middle="";
				String last="";
				for(int i=0;i<a.length;i++){
					if(a[i].isEmpty()){
						continue;
					}else{
						first=a[i];
						middle=a[i+1];
						last=a[i+2];
						break;
					}
					
				}
				String ulti= first+" "+last+" "+"<"+first+"."+last;
				String tail=">"+"@"+C.toLowerCase()+"."+"com"+";";
				if(!hs.contains(ulti)){
					hs.add(ulti);
					sb.append(ulti+tail);	
				}else{
				sb=checkHashSet(hs,ulti,2,sb,tail);				
					
				}
				
				
			}
			
		}
				
		return sb.toString();
		
	}
	private static StringBuilder checkHashSet(HashSet<String> hs, String ulti,int i,StringBuilder sb, String tail) {
		if(hs.contains(ulti)){
			checkHashSet(hs,ulti+i,i++,sb,tail);			
		}
			String s= new String(ulti+i);
			hs.add(s);
			sb.append(s+tail);
			return sb;
		
	}

}
