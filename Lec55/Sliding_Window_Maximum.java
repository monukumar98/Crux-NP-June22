package Lec55;

import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum {
	public static void main(String[] args) {
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] ans = maxWindow(arr, k);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] maxWindow(int[] arr, int k) {
		int[] ans = new int[arr.length - k + 1];
		Deque<Integer> dq = new LinkedList<>();
		int j = 0;
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				System.out.println(dq.removeLast());
			}
			dq.add(i);

		}
		ans[j] = arr[dq.getFirst()];
		j++;
		for (int i = k; i < arr.length; i++) {
			while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
				dq.removeLast();
			}
			dq.add(i);
			if (!dq.isEmpty() && dq.getFirst() == i - k) {
				dq.remove();
			}
			ans[j] = arr[dq.getFirst()];
			j++;
		}
		return ans;

	}
}
