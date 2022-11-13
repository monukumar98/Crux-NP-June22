package Lec33;

import Lec31.Queue;

public class Reverse_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue qq = new Queue();
		qq.EnQueue(10);
		qq.EnQueue(20);
		qq.EnQueue(30);
		qq.EnQueue(40);
		qq.EnQueue(50);
		qq.display();
		Reverse(qq);
		qq.display();

	}

	public static void Reverse(Queue qq) throws Exception {

		if (qq.isEmpty()) {
			return;
		}
		int x = qq.Dequeue();
		Reverse(qq);
		qq.EnQueue(x);
	}

}
