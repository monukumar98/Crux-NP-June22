package Lec52;

import java.util.*;

public class Coin_Changes_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5 };
		int amount = 5;
		int[][] dp = new int[arr.length][amount + 1];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Changes(arr, amount, arr.length - 1, dp));

	}

	public static int Coin_Changes(int[] arr, int amount, int i, int[][] dp) {
		if (amount == 0) {
			return 1;
		}
		if (i < 0) {
			return 0;
		}
		if (dp[i][amount] != -1) {
			return dp[i][amount];
		}
		int inc = 0;
		int exc = 0;
		if (amount >= arr[i]) {
			inc += Coin_Changes(arr, amount - arr[i], i, dp);// dp[i][amount-arr[i]
		}
		exc = Coin_Changes(arr, amount, i - 1, dp);// dp[i][amount]
		return dp[i][amount] = inc + exc;
	}

	public static int Coin_ChangesBU(int[] arr, int amount) {
		int[][] dp = new int[amount + 1][arr.length + 1];
		for (int i = 0; i < dp[0].length; i++) {
			dp[0][i] = 1;

		}
		for (int am = 1; am < dp.length; am++) {
			for (int i = 1; i < dp[0].length; i++) {// coin
				int inc = 0;
				int exc = 0;
				if (am >= arr[i - 1]) {
					inc = dp[am - arr[i - 1]][i];
				}
				exc = dp[am][i - 1];
				dp[am][i] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];

	}
}
