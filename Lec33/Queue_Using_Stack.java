package Lec33;

public class Queue_Using_Stack {

	private Dynmaic_Stack ds;

	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		ds = new Dynmaic_Stack();
	}

	public boolean isEmpty() {
		return ds.isEmpty();

	}

	public int size() {
		return ds.size();

	}

	public int DQueue() throws Exception {
		return ds.pop();

	}

	public int GetFornt() throws Exception {
		return ds.peek();

	}

	public void Enqeue(int item) throws Exception {
		Dynmaic_Stack hlp = new Dynmaic_Stack();
		while (!ds.isEmpty()) {

			hlp.push(ds.pop());
		}
		hlp.push(item);

		while (!hlp.isEmpty()) {

			ds.push(hlp.pop());
		}

	}

	public static void main(String[] args) throws Exception {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.Enqeue(10);
		qs.Enqeue(20);
		qs.Enqeue(30);
		qs.Enqeue(40);
		qs.Enqeue(50);
		System.out.println(qs.DQueue());
		System.out.println(qs.GetFornt());

	}

}
