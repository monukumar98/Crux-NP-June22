package Lec43;

import java.util.PriorityQueue;

public class Merge_Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 1, 3, 2 };
		System.out.println(minimum(arr));

	}

	public static int minimum(int[] arr) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.remove();
			int b = pq.remove();
			sum = sum+ a+b;
			pq.add(a+b);
		}
		return sum;

	}
}
