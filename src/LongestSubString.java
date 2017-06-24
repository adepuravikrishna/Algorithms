import java.util.Map;
import java.util.HashMap;

public class LongestSubString {
	public static void main(String[] args){
		String s="abaacbacdeaa";
		char[] c= s.toCharArray();
		String s1="$";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(m.containsKey(c[i])){
					if(m.get(c[i])<=2){
					m.put(c[i], m.get(c[i])+1);
					sb.append(c[i]);
					}					
					else{
						if((s1.length()-1)<sb.length()){
						s1=sb.toString();
						}else{
							sb= new StringBuilder();
						}
						
					}
				}else{
					m.put(c[i],i);
					sb.append(c[i]);
				}
			}
		}
		
		System.out.println(s1.replace("$", ""));
		
	}

}
