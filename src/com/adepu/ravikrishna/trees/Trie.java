package com.adepu.ravikrishna.trees;

class TrieNode {
	
	char c;
	TrieNode[] children = new TrieNode[27];
	TrieNode(char c1) {
		this.c = c1;
	}
}

public class Trie {
	
	TrieNode root ;
	
	 
	    public Trie() {         
	           root= new TrieNode('*');             
	    }
	
	public void insert(String s1) {
		TrieNode current = root;
		for (char c : s1.toCharArray()) {
			
			if (current.children[c-'a'] == null) {
				current.children[c-'a'] = new TrieNode(c);
			}
			current = current.children[c-'a'];
		}
		current.children[26] = new TrieNode('$');
	}
	
	public boolean search(String s1) {
		TrieNode current = this.root;
		for (char c : s1.toCharArray()) {
			if (current.children[c-'a'] == null) {
				return false;
			}
			current = current.children[c-'a'];
		}
		if (current.children[26] == null) { 
			return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		String s="ravi",d="pramod";
		Trie testObj = new Trie();
		
		testObj.insert(s);
		testObj.insert(d);
		boolean test= testObj.search("ravi");
		System.out.println(test);
		
		
	}
}	

