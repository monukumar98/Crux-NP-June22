package Lec24;

public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] arr = new boolean[n][n];
		Nqueen(arr, n, 0);

	}

	public static void Nqueen(boolean[][] arr, int n, int row) {
		if (n == 0) {
			Display(arr);
			return;
		}
		for (int col = 0; col < arr.length; col++) {
			if (isitsafe(arr, row, col) == true) {
				arr[row][col] = true;

				Nqueen(arr, n - 1, row + 1);
				arr[row][col] = false;
			}
		}
	}

	public static boolean isitsafe(boolean[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		// upper part
		int r = row;
		while (r >= 0) {
			if (arr[r][col] == true) {
				return false;
			}
			r--;
		}
		// left diagonal
		r = row;
		int c = col;
		while (r >= 0 && c >= 0) {
			if (arr[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal
		r = row;
		c = col;
		while (r >= 0 && c < arr.length) {
			if (arr[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void Display(boolean[][] arr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

}
