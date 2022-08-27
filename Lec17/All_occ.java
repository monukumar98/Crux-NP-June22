package Lec17;

public class All_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };
		print(arr, 0, 7);
	}

	public static void print(int[] arr, int i, int item) {
		if (i == arr.length) {
			return;
		}
		if (arr[i] == item) {
			System.out.print(i + " ");
		}
		print(arr, i + 1, item);

	}

}
