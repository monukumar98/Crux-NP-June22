package Lec44;

public class LinkedList<T> {
	private class Node {
		T val;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

// O(1)
	public void AddFirst(T item) {
		Node nn = new Node();
		nn.val = item;
		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			nn.next = head;
			head = nn;
			size++;
		}
	}

//O(1)
	public void Addlast(T item) {

		if (size == 0) {
			AddFirst(item);
		} else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}

	}

// O(n)
	public void Addatindex(T item, int k) throws Exception {
		if (k < 0 || k > size) {
			throw new Exception("Bklol ho k range me nhi h");
		}
		if (k == 0) {
			AddFirst(item);
		} else if (k == size) {
			Addlast(item);
		} else {
			Node k_1th = GetNode(k - 1);
			Node nn = new Node();
			nn.val = item;
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;

		}

	}

	private Node GetNode(int k) throws Exception {

		if (k < 0 || k >= size) {
			throw new Exception("Bklol ho k range me nhi h");
		}
		Node temp = head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;

	}
	// O(1)

	public T getFirst() {

		return head.val;
	}
	// O(1)

	public T getlast() {

		return tail.val;
	}
	// O(N)

	public T getNodeatindex(int k) throws Exception {
		return GetNode(k).val;
	}
	// O(1)

	public T removeFirst() {

		Node temp = head;
		head = head.next;
		if (size == 1) {
			tail = null;
		}
		temp.next = null;
		size--;
		return temp.val;
	}

	public T removelast() throws Exception {

		if (size == 1) {
			return removeFirst();
		} else {
			Node nn = GetNode(size - 2);
			Node temp = tail;
			tail = nn;
			tail.next = null;
			size--;
			return temp.val;
		}

	}

//O(N)
	public T removeatindex(int k) throws Exception {
		if (k < 0 || k >= size) {
			throw new Exception("Bklol ho k range me nhi h");
		}
		if (k == 0) {
			return removeFirst();
		} else if (k == size - 1) {
			return removelast();
		} else {

			Node prev = GetNode(k - 1);
			Node curr = prev.next;
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.val;
		}

	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		LinkedList<Integer> ll1 = new LinkedList<>();
		ll.Addlast("Raj");
		ll.Addlast("Anku");
		ll.Addlast("Madan Lal");
		ll.Addlast("Kamlesh");
		ll1.Addlast(1);
		ll1.Addlast(11);

		ll1.Addlast(14);
		ll.Display();
		ll1.Display();
	}

}