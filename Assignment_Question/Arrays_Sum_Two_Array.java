package Assignment_Question;

import java.util.ArrayList;

public class Arrays_Sum_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 8, 8 };
		int[] arr1 = { 9, 7 };
		Sum(arr, arr1);

	}

	public static void Sum(int[] arr1, int[] arr2) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (i >= 0 || j >= 0) {
			int sum = 0;
			if (i >= 0) {
				sum += arr1[i];
				i--;
			}
			if (j >= 0) {
				sum += arr2[j];
				j--;
			}
			sum += carry;
			list.add(sum % 10);
			carry = sum / 10;

		}
		if (carry > 0) {
			list.add(carry);
		}
		for (i = list.size() - 1; i >= 0; i--) {

			System.out.print(list.get(i) + ", ");
		}
		System.out.println("END");
	}

}
