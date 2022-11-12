package Lec31;

public class Queue_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.EnQueue(10);
		q.EnQueue(20);
		q.EnQueue(30);
		q.EnQueue(40);
		System.out.println(q.Getfront());
		System.out.println(q.Dequeue());
		System.out.println(q.Getfront());
		q.EnQueue(60);
		q.EnQueue(70);
		q.display();
	}

}
