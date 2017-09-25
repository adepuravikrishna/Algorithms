package com.adepu.ravikrishna.strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class KthMostOccuring {
	public static void main(String[] args)
	{
		String[] s={"RAVI","VAMSHI","VAMSHI","VAMSHI","VAMSHI","RAVI","AKHIL","AKHIL","MYNAM"};
		Map<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<s.length;i++){
			if(hm.containsKey(s[i]))
				hm.put(s[i], hm.get(s[i])+1);
			else
				hm.put(s[i],1);			
		}
		Map<String,Integer> m=  hm.entrySet().stream()
                .sorted(Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue,
                         (e1,e2) -> e1, LinkedHashMap::new));
		for(Map.Entry<String,Integer> i:m.entrySet()){
			System.out.println(i.getKey() +"  "+i.getValue());		
		}

	}


}
