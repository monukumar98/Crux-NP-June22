package Lec26;

public class Minimum_number_from_given_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "DDIIIDD";
		Minimumnumber(str);

	}

	public static void Minimumnumber(String str) {
		int[] ans = new int[str.length() + 1];
		int c = 1;
		for (int i = 0; i <= str.length(); i++) {

			if (i == str.length() || str.charAt(i) == 'I') {
				ans[i] = c;
				c++;
				for (int j = i - 1; j >= 0 && str.charAt(j) != 'I'; j--) {
					ans[j] = c;
					c++;

				}
			}

		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
