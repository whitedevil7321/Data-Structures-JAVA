package Trie;

public class Trie {
    private trienode root;
    public Trie(){
        root=new trienode();
        System.out.println("The Trie has been created"); 
    }

    public void insert(String word){
        trienode current=root;
        for (int i =0;i<word.length();i++){
            char ch=word.charAt(i);
            trienode node=current.children.get(ch);
            if(node==null){
                node=new trienode();
                current.children.put(ch,node);
            }
            current=node;
        }   
        current.EndofString=true;
        System.out.println("The word "+word+" has been inserted into the Trie");
    }
}
