package Lec51;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 7, 2, 4 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(Robber(arr, 0));
	}

	public static int Robber(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}

		int rob = arr[i] + Robber(arr, i + 2);
		int Dntrob = Robber(arr, i + 1);
		return Math.max(rob, Dntrob);

	}

	public static int RobberTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD(arr, i + 2, dp);//dp[i+2]
		int Dntrob = RobberTD(arr, i + 1, dp);//dp[i+1]
		return dp[i] = Math.max(rob, Dntrob);

	}
	public static int RobberTD2(int[] arr, int i, int[] dp) {
		if (i <0) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int rob = arr[i] + RobberTD2(arr, i - 2, dp);//dp[i-2]
		int Dntrob = RobberTD2(arr, i -1, dp);//dp[i-1]
		return dp[i] = Math.max(rob, Dntrob);

	}
	public static int RobberBU(int []arr) {
		int[] dp = new int[arr.length];
		dp[0]=arr[0];
		dp[1]=Math.max(arr[0], arr[1]);
		for (int i = 2; i < dp.length; i++) {
			int rob = arr[i] +dp[i-2];
			int Dntrob =dp[i-1];
			dp[i] = Math.max(rob, Dntrob);
		}
		return dp[dp.length-1];
	}
	

}
