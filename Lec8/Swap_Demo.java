package Lec8;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 3, 4, 1, 11, 3, 90, -9 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
