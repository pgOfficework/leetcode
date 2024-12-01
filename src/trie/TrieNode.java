package trie;

import java.util.HashMap;

public class TrieNode {
    private HashMap<Character, TrieNode> chain = new HashMap<>();
    private boolean isEndOfWord = false;

    public void setEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }

    public boolean isEndOfWord() {
        return this.isEndOfWord;
    }

    public void add(char c) {
        this.chain.put(c, new TrieNode());
    }

    public boolean contains(char c) {
        return !this.chain.containsKey(c);
    }

    public TrieNode get(char c) {
        return this.chain.get(c);
    }

    public HashMap<Character, TrieNode> get() {
        return this.chain;
    }


}