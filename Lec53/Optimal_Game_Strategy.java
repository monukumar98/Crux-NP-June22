package Lec53;

public class Optimal_Game_Strategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 8, 2, 3};
		System.out.println(Optimal_Game(arr, 0, arr.length-1));
	}

	public static int Optimal_Game(int[] arr, int i, int j) {
		if (i > j) {
			return 0;
		}

		int fs = arr[i] + Math.min(Optimal_Game(arr, i + 2, j), Optimal_Game(arr, i + 1, j - 1));
		int ss = arr[j] + Math.min(Optimal_Game(arr, i + 1, j - 1), Optimal_Game(arr, i, j - 2));
		return Math.max(fs, ss);
	}

}
