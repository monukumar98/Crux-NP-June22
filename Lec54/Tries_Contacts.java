package Lec54;

import java.util.HashMap;

public class Tries_Contacts {
	class Node {
		char ch;
		boolean isTerminal;
		HashMap<Character, Node> children;
		int count;

		public Node(char ch) {
			// TODO Auto-generated constructor stub
			this.ch = ch;
			children = new HashMap<>();
			isTerminal = false;
			count = 1;
		}

	}

	private Node root;

	public Tries_Contacts() {
		root = new Node('*');

	}

	public void insert(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node.count++;
				node = node.children.get(ch);

			} else {
				Node nn = new Node(ch);
				node.children.put(ch, nn);

				node = nn;
			}
		}
		node.isTerminal = true;

	}

	public boolean search(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return false;
			}
		}
		return node.isTerminal;
	}

	public int Count_Prefix(String word) {
		Node node = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return 0;
			}
		}
		return node.count;
	}

	public boolean startsWith(String prefix) {
		Node node = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (node.children.containsKey(ch)) {
				node = node.children.get(ch);

			} else {
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		Tries_Contacts t = new Tries_Contacts();
		t.insert("apple");
		t.insert("ankit");
		t.insert("ankita");
		t.insert("mango");
		t.insert("go");
		t.insert("man");
		t.insert("kamlesh");
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("app"));
		System.out.println(t.Count_Prefix("an"));
		

	}

}
