package Lec52;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matix = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matix[0].length; i++) {
			ans = Math.min(Falling_Path_Sum(matix, 0, i), ans);
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] matix, int cr, int cc) {
		if (cc < 0 || cc >= matix[0].length) {
			return Integer.MAX_VALUE;
		}
		if (cr == matix.length - 1) {
			return matix[cr][cc];
		}
		int v1 = Falling_Path_Sum(matix, cr + 1, cc - 1);
		int v2 = Falling_Path_Sum(matix, cr + 1, cc);
		int v3 = Falling_Path_Sum(matix, cr + 1, cc + 1);
		return Math.min(v1, Math.min(v2, v3)) + matix[cr][cc];
	}

}
