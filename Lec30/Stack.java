package Lec30;

public class Stack {

	protected int[] arr;
	private int top;

	public Stack() {
		arr = new int[5];
		top = -1;
	}

	public Stack(int n) {
		arr = new int[n];
		top = -1;
	}

	public boolean isEmpty() {

		return top == -1;
	}

	public boolean isfull() {
		return top == arr.length - 1;
	}

	public void push(int item) throws Exception {
		if (isfull() == true) {

			throw new Exception("Stack full hai");

		}
		this.top++;
		this.arr[this.top] = item;
	}

	public int pop() throws Exception {
		if (isEmpty() == true) {

			throw new Exception("Stack empty hai");

		}

		int rv = arr[top];
		top--;
		return rv;
	}

	public int peek() throws Exception {
		if (isEmpty() == true) {

			throw new Exception("Stack empty hai");

		}
		int rv = arr[top];

		return rv;
	}

	public int size() {
		return top + 1;
	}

	public void Display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
