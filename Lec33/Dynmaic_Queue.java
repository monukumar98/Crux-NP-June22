package Lec33;

import Lec31.Queue;

public class Dynmaic_Queue extends Queue {
	@Override
	public void EnQueue(int item) throws Exception {

		if (isfull()) {
			int[] a = new int[2 * arr.length];
			for (int i = 0; i < size(); i++) {
				int idx = (front + i) % arr.length;
				a[i] = arr[idx];
			}
			arr = a;
			front = 0;

		}

		super.EnQueue(item);
	}

	public static void main(String[] args) throws Exception {
		Dynmaic_Queue dq = new Dynmaic_Queue();
		dq.EnQueue(10);
		dq.EnQueue(20);
		dq.EnQueue(30);
		dq.EnQueue(40);
		dq.EnQueue(50);
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		dq.EnQueue(60);
		dq.EnQueue(70);
		dq.EnQueue(80);
		dq.display();
		System.out.println(dq.Dequeue());

	}
}
