package Lec10;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 4, 5, 7 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int j = i - 1;
			int item = arr[i];
			while (j >= 0 && arr[j] > item) {
				arr[j+1] = arr[j];
				j--;
			}
			j++;
			arr[j] = item;

		}

	}

}
