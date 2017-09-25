package com.adepu.ravikrishna.strings;
class Node{
    char c;
    Node[] children=new Node[27];
    public Node(char ch)
    {
        this.c=ch;
    }
}

public class Trie {

    
    /** Initialize your data structure here. */   
    Node root;
    public Trie() {         
           root=new Node('*');              
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);            
            if(current.children[ch-'a']==null)
            {
                current.children[ch-'a']=new Node(ch);                
            }
            current=current.children[ch-'a'];
        }        
        current.children[26]=new Node('$');
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
         Node current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);            
            if(current.children[ch-'a']==null)
            {
                return false;               
            }
            current=current.children[ch-'a'];
        }  
        return current.children[26]!=null?true:false;            
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node current=root;
        for(int i=0;i<prefix.length();i++)
        {
            char ch=prefix.charAt(i);            
            if(current.children[ch-'a']==null)
            {
                return false;               
            }
            current=current.children[ch-'a'];
        }  
        return true;         
    }
    
    public static void main(String[] args){
    	 String word="ravi";
    	 Trie obj = new Trie();
    	 obj.insert(word);
    	 word="ravi";
    	 String prefix="ra";
    	 boolean param_2 = obj.search(word);
    	 boolean param_3 = obj.startsWith(prefix);
    	 System.out.println(param_2);
    	 System.out.println(param_3);
    	
    	
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */