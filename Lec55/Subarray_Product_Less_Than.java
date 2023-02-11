package Lec55;

public class Subarray_Product_Less_Than {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2, 3 };
		int k = 10;
		System.out.println(NumberSubArray(arr, k));

	}

	public static int NumberSubArray(int[] arr, int k) {

		int si = 0, ei = 0, ans = 0;
		int p = 1;
		while ( ei<arr.length) {
			p = p * arr[ei];

			while (p >= k && si<=ei) {
				p = p / arr[si];
				si++;

			}
			ans += (ei - si + 1);
			ei++;
		}
		return ans;

	}

}
