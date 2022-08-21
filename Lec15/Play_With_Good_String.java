package Lec15;

import java.util.Scanner;

public class Play_With_Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(PlayingwithgoodString(str));

	}

	public static int PlayingwithgoodString(String str) {

		int count = 0;
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (isvowels(ch) == true) {
				count++;
			} else {
				ans = Math.max(ans, count);
				count = 0;
			}
		} 

		ans = Math.max(ans, count);
		return ans;

	}

	public static boolean isvowels(char ch) {
		// TODO Auto-generated method stub
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else {
			return false;
		}
	}
}
