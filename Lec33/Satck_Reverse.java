package Lec33;

import java.util.Stack;

public class Satck_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Reverse(st);
		System.out.println(st);

	}

	private static void Reverse(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			return;
		}
		int x = st.pop();
		Reverse(st);
		Insert_button(st, x);

	}

	public static void Insert_button(Stack<Integer> st, int item) {
		if (st.isEmpty() == true) {
			st.push(item);
			return;

		}
		int x = st.pop();
		Insert_button(st, item);
		st.push(x);

	}

}
