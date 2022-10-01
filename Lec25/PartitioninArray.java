package Lec25;

public class PartitioninArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 9, 2, 3, 6, 7, 8, 4 };
		int idx = partition(arr, 0, arr.length - 1);
		System.out.println(idx);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

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
