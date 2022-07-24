package Lec9;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 5, 3, 17, 2, 8, 11 };
		int item = -2;
		System.out.println(Search(arr, item));

	}

	public static int Search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}

		}
		return -1;

	}

}
