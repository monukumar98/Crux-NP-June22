package Lec31;

public class Queue {
	private int[] arr;
	private int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		front = 0;
		size = 0;
	}

	public Queue(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		front = 0;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isfull() {
		return size == arr.length;
	}

	public void EnQueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("Queue full h");
		}
		int i = (front + size) % arr.length;
		arr[i] = item;
		size++;
	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue khaali h");
		}
		int rv = arr[front];
		front = (front + 1) % arr.length;
		size--;
		return rv;
	}

	public int Getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue khaali h");
		}
		int rv = arr[front];

		return rv;
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < size(); i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();

	}
}
