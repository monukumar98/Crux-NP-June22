package Lec33;

public class Stack_Using_queue {

	private Dynmaic_Queue q;

	public Stack_Using_queue() {
		// TODO Auto-generated constructor stub
		q = new Dynmaic_Queue();
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

	public int size() {
		return q.size();
	}

	public void push(int item) throws Exception {

		q.EnQueue(item);

	}

	public int pop() throws Exception {

		Dynmaic_Queue hlp = new Dynmaic_Queue();
		while (q.size() > 1) {
			hlp.EnQueue(q.Dequeue());
		}
		int rv = q.Dequeue();
		q = hlp;
		return rv;
	}

	public int peek() throws Exception {

		Dynmaic_Queue hlp = new Dynmaic_Queue();
		while (q.size() > 1) {
			hlp.EnQueue(q.Dequeue());
		}
		int rv = q.Dequeue();
		q = hlp;
		q.EnQueue(rv);
		return rv;
	}
	public static void main(String[] args) throws Exception {
		Stack_Using_queue ds = new  Stack_Using_queue();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		System.out.println(ds.peek());
	}

}
