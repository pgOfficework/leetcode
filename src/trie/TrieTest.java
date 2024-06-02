package trie;


import java.util.ArrayList;
import java.util.List;

public class TrieTest {
    private TrieNode root = new TrieNode();

    public static void main(String[] args) {
        TrieTest trie = new TrieTest();

        List<String> inputList=List.of("prathamesh","pratik","patric","pat","java");
        for (String s: inputList){
            trie.insert(s);
        }
        System.out.println();
        System.out.println(trie.search("prat-"));

        List<String> results = trie.autoComplete("pra");
        System.out.println(results);
    }

    public void insert(String word) {

        insert(word, root);
    }

    public boolean search(String word) {
        if (word == null || word.isEmpty()) return false;
        return search(word, root);
    }

    private boolean search(String word, TrieNode node) {
        if (word == null || word.isEmpty()) return true;
        char c = word.charAt(0);
        if (c == '-' || c == '.' || c == ',') return true;
        if (node.contains(c)) return false;
        
        return search(word.substring(1), node.get(c));
    }


    private void insert(String word, TrieNode node) {
        if (word == null || word.isEmpty()) return;
        char c = word.charAt(0);
        if (node.contains(c)) node.add(c);
        TrieNode nextNode = node.get(c);
        if (word.length() == 1) nextNode.setEndOfWord(true);
        insert(word.substring(1), nextNode);

    }

    public List<String> autoComplete(String prefix) {
        List<String> results = new ArrayList<>();
        TrieNode node = root;


        for (char c : prefix.toCharArray()) {
            if (node.contains(c)) {
                return results; // No words with the given prefix
            }
            node = node.get(c);
        }

        autoCompleteHelper(node, prefix, results);
        return results;
    }

    private void autoCompleteHelper(TrieNode node, String prefix, List<String> results) {
        if (node.isEndOfWord()) {
            results.add(prefix);
        }

        for (char c : node.get().keySet()) {
            autoCompleteHelper(node.get(c), prefix + c, results);
        }
    }
}
