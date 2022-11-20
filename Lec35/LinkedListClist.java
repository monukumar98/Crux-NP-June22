package Lec35;

public class LinkedListClist {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.Display();
		ll.Addlast(90);
		ll.Addatindex(-3, 2);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getNodeatindex(3));
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removelast());
		ll.Display();
		System.out.println(ll.removeatindex(1));
		ll.Display();
		

	}

}
