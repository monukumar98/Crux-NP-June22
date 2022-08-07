package Lec12;

public class kadane_algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, -4, -7, 5, -4, 11 };
		System.out.println(SubarraySum(arr));

	}

	public static int SubarraySum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}

		}
		return ans;

	}

}
