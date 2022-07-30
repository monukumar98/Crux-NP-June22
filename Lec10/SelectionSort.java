package Lec10;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 4, 5, 7 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int mini = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[mini] > arr[j]) {
					mini = j;
				}
			}

			int t = arr[i];
			arr[i] = arr[mini];
			arr[mini] = t;

		}

	}

}
