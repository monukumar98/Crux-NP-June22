package Lec16;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		list.add(1, -90);// index ka range 0 to size
		System.out.println(list);
		System.out.println(list.size());
		// Get

		System.out.println(list.get(3));
//		// remove
//		System.out.println(list.remove(2));
//		System.out.println(list);
//		list.add(20);
		System.out.println(list);
		list.set(2, -20);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		list.add(89);
		list.add(189);
		list.add(289);
		list.add(389);
		list.add(489);
		list.add(-89);
		list.add(89);
		System.out.println(list);
		for(int val : list) {
			System.out.print(val+" ");
		}

	}

}
