package Lec9;

public class Maximum_InArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 5, 3, 17, 2, 8, 11 };
		System.out.println(max(arr));
	}

	public static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static int max2(int[] arr) {
		//Integer.MAX_VALUE 2^31-1
		int max = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;

	}

}
