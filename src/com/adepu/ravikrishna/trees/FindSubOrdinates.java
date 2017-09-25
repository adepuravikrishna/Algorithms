package com.adepu.ravikrishna.trees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Employee{
	String name;
	String reportTo;
	Employee next;
	public Employee(String name,String reportTo) {
		this.name=name;
		this.reportTo=reportTo;	
		this.next=null;
	}

}

public class FindSubOrdinates {
	

	public static void main(String [] args){
		Employee e= new Employee("ravi","pramod");
		e.next= new Employee("adepu","ravi");
		e.next.next=new Employee("pramod","sid");		
		Set<String> ls=new HashSet<String>();
		String s="sid";
		ls= findSubrdinates(s,e);
		System.out.println(Arrays.toString(ls.toArray()));
		System.exit(0);				
	}

	private static Set<String> findSubrdinates(String s, Employee e) {
		Map<String,Set<String>> map=new HashMap<String,Set<String>>();
		Set<String> ls=new HashSet<String>();
		while(e!=null){
			Set<String> tempLs= map.containsKey(e.reportTo)?map.get(e.reportTo):new HashSet<String>();
			tempLs.add(e.name);
			map.put(e.reportTo, tempLs);
			e=e.next;
		}		
		return recursiveHelper(map,s,ls);
	}

	private static Set<String> recursiveHelper(Map<String, Set<String>> map, String s,Set<String> ls) {
		if(!map.containsKey(s)){
		return ls;
		}else if(ls.contains(s)){			
			return ls;
		}
		else{
			Set<String> list= map.get(s);
			for(String emp:list){
				list.addAll(recursiveHelper(map,emp,list));				
			}
			return list;
		}	  
		
	}

}
