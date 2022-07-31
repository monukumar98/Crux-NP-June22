package Lec11;

public class Product_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 6 };
		arr = Product(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static int[] Product(int[] arr) {
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = arr[i - 1] * left[i - 1];

		}
		right[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			right[i] = right[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < right.length; i++) {
			arr[i] = left[i] * right[i];
		}
		return arr;

	}

}
