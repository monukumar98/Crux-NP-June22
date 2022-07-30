package Lec10;

public class Sort_Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 2, 1, 0, 2, 1 };
		sortColors(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sortColors(int[] nums) {
		int i = 0;// 0 wala element
		int j = nums.length - 1;// 2 wala element

		int mid = 0;
		while (mid <= j) {
			if (nums[mid] == 2) {
				int t = nums[mid];
				nums[mid] = nums[j];
				nums[j] = t;
				j--;

			} else if (nums[mid] == 0) {
				int t = nums[mid];
				nums[mid] = nums[i];
				nums[i] = t;
				i++;
				mid++;

			} else {
				mid++;
			}
		}

	}

}
