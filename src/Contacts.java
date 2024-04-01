import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {
	static class Node {
		Node[] children;
		int count;

		public Node() {
			children = new Node[26]; // a to z
			for (int i = 0; i < 26; i++) {
				children[i] = null;
			}
			count = 0;
		}
	}

	static Node root = new Node();

	public static void insert(Node root, String word) {
		Node curr = root;

		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
	//		System.out.println(idx);
			if (curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];
			curr.count++;
		}
		
	}

	public static int search(Node root, String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			int idx = word.charAt(i) - 'a';
			if (curr.children[idx] == null) {
				return 0;
			}
			curr = curr.children[idx];
		}
		return curr.count;
	}

	public static List<Integer> contacts(List<List<String>> queries) {
// Write your code here
		List<Integer> result = new ArrayList<>();
		root = new Node();

		for (List<String> q : queries) {
			if (q.get(0).charAt(0) == 'a') {
				insert(root, q.get(1));

			} else {
				result.add(search(root, q.get(1)));
			}
		}
		return result;

	}
}

public class Contacts {
	public static void main(String[] args) throws IOException {

		List<List<String>> queries = new ArrayList<>();
		queries.add(Arrays.asList("add", "hack"));
		queries.add(Arrays.asList("add", "hackerrank"));
		queries.add(Arrays.asList("find", "hac"));
		queries.add(Arrays.asList("find", "hak"));
		List<Integer> result = Result.contacts(queries);
		System.out.println(result);

	}
}
