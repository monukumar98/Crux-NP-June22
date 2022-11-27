package Lec37;

public class Cycle_Removal {
	private class Node {
		int val;
		Node next;
	}

	private Node head;
	private int size;
	private Node tail;

//O(1)
	public void AddFirst(int item) {
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
	public void Addlast(int item) {

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

	public void createCycle() throws Exception {
		this.tail.next = GetNode(2);
	}

	public void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

	public Node hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	public void removeCycle1() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node start = head;
		while (start != null) {
			Node temp = meet;
			while (temp.next != meet) {
				if (temp.next == start) {
					temp.next = null;
					return;
				}
				temp = temp.next;
			}
			start = start.next;
		}
	}

	public void removeCycle2() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		int count = 1;
		Node temp = meet;
		while (temp.next != meet) {

			temp = temp.next;
			count++;
		}
		Node fast = head;
		for (int i = 1; i <= count; i++) {
			fast = fast.next;
		}

		Node slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public void floyedCycleRemoval() {
		Node meet = hasCycle();
		if (meet == null) {
			return;
		}
		Node slow = head;
		Node fast = meet;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;

	}

	public static void main(String[] args) throws Exception {
		Cycle_Removal cr = new Cycle_Removal();
		cr.Addlast(1);
		cr.Addlast(2);
		cr.Addlast(3);
		cr.Addlast(4);
		cr.Addlast(5);
		cr.Addlast(6);
		cr.Addlast(7);
		cr.Addlast(8);
		cr.createCycle();
		// cr.removeCycle2();
		cr.floyedCycleRemoval();
		cr.Display();
	}
}
