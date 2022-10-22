package Assignment_Question;

public class SUBSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 2, 4 };
		int target = 5;
//		int a = SubSet(arr, 0, 0, target, "");
//		System.out.println();
//
//		System.out.println(a);
		System.out.println("\n" + SubSet(arr, 0, 0, target, ""));

	}

	public static int SubSet(int[] arr, int i, int sum, int target, String ans) {
		if (i == arr.length) {
			if (sum == target) {
				System.out.print(ans + " ");
				return 1;
			}
			return 0;
		}

		int a = SubSet(arr, i + 1, sum + arr[i], target, ans + arr[i] + " ");
		int b = SubSet(arr, i + 1, sum, target, ans);
		return a + b;

	}

}
