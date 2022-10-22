package Assignment_Question;

public class Maximum_Sum_Path_in_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 3, 7, 10, 12, 15, 30, 34 };
		int[] arr2 = { 1, 5, 7, 8, 10, 15, 16, 19 };
		System.out.println(Maximum_Sum_Path(arr1, arr2));

	}

	public static int Maximum_Sum_Path(int[] arr1, int[] arr2) {

		int i = 0;
		int j = 0;
		int ans = 0;
		int s1 = 0;
		int s2 = 0;
		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				int sum1 = 0;
				for (int k = s1; k <= i; k++) {
					sum1 += arr1[k];
				}
				int sum2 = 0;
				for (int k = s2; k <= j; k++) {
					sum2 += arr2[k];
				}
				ans = Math.max(sum1, sum2) + ans;
				i++;
				j++;
				s1 = i;
				s2 = j;

			}
		}
		int sum1 = 0;
		while (s1 < arr1.length) {
			sum1 += arr1[s1];
			s1++;
		}
		int sum2 = 0;
		while (s2 < arr2.length) {
			sum2 += arr1[s2];
			s2++;
		}
		ans = ans + Math.max(sum1, sum2);
		return ans;

	}

}
