package Lec17;

public class Last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };

		System.out.println(Last(arr, arr.length - 1, 7));

	}

	public static int Last(int[] arr, int i, int item) {
		if (i < 0) {
			return -1;
		}
		if (arr[i ] == item) {
			return i;
		}
		return Last(arr, i-1, item);

	}

}
