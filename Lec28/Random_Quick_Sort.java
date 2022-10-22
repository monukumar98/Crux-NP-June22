package Lec28;

public class Random_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 2, 3, 6, 7, 8, 4 };
		Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr, int si, int ei) {
		if (si > ei) {
			return;
		}
		int pi = partition(arr, si, ei);
		Sort(arr, si, pi - 1);
		Sort(arr, pi + 1, ei);

	}

	public static int partition(int[] arr, int si, int ei) {

		int item = arr[ei];
		int pi = si;
		for (int i = si; i < ei; i++) {

			if (arr[i] < item) {
				int t = arr[i];
				arr[i] = arr[pi];
				arr[pi] = t;
				pi++;
			}
		}
		int t = arr[ei];
		arr[ei] = arr[pi];
		arr[pi] = t;
		return pi;

	}
}
