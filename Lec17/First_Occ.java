package Lec17;

public class First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 7, 2, 7, 3, 2, 7, 2, 3 };

		System.out.println(First(arr, 0, 7));

	}

	public static int First(int[] arr, int i, int item) {
		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}
		return First(arr, i + 1, item);
		

	}

}
