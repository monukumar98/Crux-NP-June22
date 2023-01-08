package Lec45;

import java.util.*;

public class Set_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// add
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(-1);
		set.add(3);
		set.add(10);
		set.add(90);
		set.add(-9);
		System.out.println(set);
		// contains
		System.out.println(set.contains(4));
		// remove
		System.out.println(set.remove(2));
		System.out.println(set);
		System.out.println(set.size());

		for (int val : set) {
			System.out.print(val + " ");
		}
		System.out.println();
		TreeSet<Integer> set1 = new TreeSet<>();
		// add
		set1.add(1);
		set1.add(2);
		set1.add(5);
		set1.add(-1);
		set1.add(3);
		set1.add(10);
		set1.add(90);
		set1.add(-9);
		System.out.println(set1);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		// add
		set2.add(1);
		set2.add(2);
		set2.add(5);
		set2.add(-1);
		set2.add(3);
		set2.add(10);
		set2.add(90);
		set2.add(-9);
		System.out.println(set2);
		

	}

}
