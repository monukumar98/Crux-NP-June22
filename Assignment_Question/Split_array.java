package Assignment_Question;

public class Split_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 3, 4, 5 };
		System.out.println(Split(arr, 0, 0, "", 0, ""));

	}

	public static int Split(int[] arr, int i, int sum1, String ans1, int sum2, String ans2) {
		if (i == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + " and " + ans2);
				return 1;
			}
			return 0;

		}

		int a = Split(arr, i + 1, sum1 + arr[i], ans1 + arr[i] + " ", sum2, ans2);
		int b = Split(arr, i + 1, sum1, ans1, sum2 + arr[i], ans2 + arr[i] + " ");
		return a + b;

	}

}
