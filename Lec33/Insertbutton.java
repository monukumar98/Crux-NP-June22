package Lec33;

import java.util.Stack;

public class Insertbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		Insert_button(st, 60);
		System.out.println(st);
	}

	public static void Insert_button(Stack<Integer> st, int item) {
		if (st.isEmpty()==true) {
			st.push(item);
			return;

		}
		int x = st.pop();
		Insert_button(st, item);
		st.push(x);

	}

}
