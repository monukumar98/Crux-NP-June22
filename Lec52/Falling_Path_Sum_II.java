package Lec52;

public class Falling_Path_Sum_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(Falling_Path_Sum(grid, 0, i), ans);
		}
		System.out.println(ans);
	}

	public static int Falling_Path_Sum(int[][] matix, int cr, int cc) {

		if (cr == matix.length - 1) {
			return matix[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < matix[0].length; i++) {
			if (i != cc) {
				ans = Math.min(ans, Falling_Path_Sum(matix, cr + 1, i));
			}
		}

		return ans+matix[cr][cc];
	}

}
