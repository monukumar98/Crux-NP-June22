package Lec46;

import java.util.ArrayList;

public class HashMap<K, V> {

	public class Node {
		K key;
		V val;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			bukt.add(null);
		}
	}

	public HashMap() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(K key, V value) {
		int bn = hashfun(key);
		Node temp = bukt.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.val = value;
				return;
			}
			temp = temp.next;
		}
		size++;
		Node nn = new Node();
		nn.key = key;
		nn.val = value;
		temp = bukt.get(bn);
		nn.next = temp;
		bukt.set(bn, nn);
		double thf = 2.0;
		double lf = (1.0 * size) / bukt.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * bukt.size(); i++) {
			nba.add(null);
		}
		ArrayList<Node> oba = bukt;
		bukt = nba;
		for (int i = 0; i < oba.size(); i++) {
			Node temp = bukt.get(i);
			while (temp != null) {
				put(temp.key, temp.val);
				temp = temp.next;
			}
		}

	}

	public boolean containsKey(K key) {

		int bn = hashfun(key);
		Node temp = bukt.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {

		int bn = hashfun(key);
		Node temp = bukt.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.val;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int bn = hashfun(key);
		Node curr = bukt.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;

			}
			prev = curr;
			curr = curr.next;
		}

		if (curr == null) {
			return null;
		}
		size--;
		if (prev == null) {
			curr = bukt.get(bn);
			bukt.set(bn, curr.next);
			curr.next = null;
			return curr.val;
		} else {
			prev.next = curr.next;
			curr.next = null;
			return curr.val;
		}

	}

	private int hashfun(K key) {
		int bn = key.hashCode() % bukt.size();
		if (bn < 0) {
			bn += bukt.size();
		}
		return bn;
	}
	
	public String toString() {
		
		String s="{";
		for (int i = 0; i < bukt.size(); i++) {
			Node temp = bukt.get(i);
			while (temp != null) {
				s= s+ temp.key+"="+temp.val+", ";
				temp = temp.next;
			}
		}
		s=s+"}";
		return s;
		
	}

}
