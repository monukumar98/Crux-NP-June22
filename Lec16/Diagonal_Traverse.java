package Lec16;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int[] ans = DiagonalTraverse(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] DiagonalTraverse(int[][] arr) {
		int n = arr.length;// row
		int m = arr[0].length;// col;
		int[] ans = new int[n * m];
		int idx = 0;
		for (int d = 0; d < n + m - 1; d++) {
			int r = 0, c = 0;
			if (d < m) {
				c = d;
			} else {
				c = m - 1;
				r = d - m + 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < n && c >= 0) {
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
			for (int i = 0; i < list.size(); i++) {
				ans[idx] = list.get(i);
				idx++;
			}

		}
		return ans;

	}

}
