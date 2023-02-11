package Lec55;

public class Maximum_SubArray_Of_Size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 1, 3, 4, 5, 8, 1, 4, 9 };
		int k = 3;
		System.out.println(MAxSum(arr, k));

	}

	public static int MAxSum(int[] arr, int k) {
		int ans = 0;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		ans = sum;
		for (int i = k; i < arr.length; i++) {
			sum += arr[i];
			sum -= arr[i - k];
			ans = Math.max(ans, sum);

		}
		return ans;

	}

}
