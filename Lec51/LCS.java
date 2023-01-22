package Lec51;

import java.util.Arrays;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcde";
		String s2 = "ace";
		int[][] dp = new int[s1.length()][s2.length()];
//		for (int i = 0; i < dp.length; i++) {
//			for (int j = 0; j < dp[0].length; j++) {
//				dp[i][j]=-1;
//			}
//		}
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		// System.out.println(Lcs(s1, s2, 0, 0, dp));
		System.out.println(Lcs2(s1, s2, s1.length() - 1, s2.length() - 1, dp));
		System.out.println(lcsBU(s1, s2));
		System.out.println(lcsBU2(s1, s2));
	}

	// i-->s1 j-->s2
	public static int Lcs(String s1, String s2, int i, int j, int[][] dp) {
		if (i == s1.length() || j == s2.length()) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + Lcs(s1, s2, i + 1, j + 1, dp);// dp[i+1][j+1]
		} else {
			int fs = Lcs(s1, s2, i + 1, j, dp);// dp[i+1][j]
			int ss = Lcs(s1, s2, i, j + 1, dp);// dp[i][j+1]
			ans = Math.max(fs, ss);
		}
		return dp[i][j] = ans;
	}

	// i-->s1 j-->s2
	public static int Lcs2(String s1, String s2, int i, int j, int[][] dp) {
		if (i < 0 || j < 0) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = 1 + Lcs2(s1, s2, i - 1, j - 1, dp);// dp[i-1][j-1]
		} else {
			int fs = Lcs2(s1, s2, i - 1, j, dp);// dp[i-1][j]
			int ss = Lcs2(s1, s2, i, j - 1, dp);// dp[i][j-1]
			ans = Math.max(fs, ss);
		}
		return dp[i][j] = ans;
	}

	public static int lcsBU(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = s2.length() - 1; j >= 0; j--) {
				int ans = 0;
				if (s1.charAt(i) == s2.charAt(j)) {
					ans = 1 + dp[i + 1][j + 1];
				} else {
					int fs = dp[i + 1][j];
					int ss = dp[i][j + 1];
					ans = Math.max(fs, ss);
				}
				dp[i][j] = ans;
			}
		}
		return dp[0][0];

	}

	public static int lcsBU2(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int ans = 0;
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					ans = 1 + dp[i - 1][j - 1];
				} else {
					int fs = dp[i - 1][j];
					int ss = dp[i][j - 1];
					ans = Math.max(fs, ss);
				}
				dp[i][j] = ans;
			}

		}

		return dp[dp.length-1][dp[0].length - 1];

	}

}
