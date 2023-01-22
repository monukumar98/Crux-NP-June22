package Lec51;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int a = Climbing_Stairs(arr, 0);
		int b = Climbing_Stairs(arr, 1);
		System.out.println(Math.min(b, a));

	}

	public static int Climbing_Stairs(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int fs = Climbing_Stairs(arr, i + 1);
		int ss = Climbing_Stairs(arr, i + 2);
		return arr[i] + Math.min(fs, ss);

	}

}
