package Lec2;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int star = 2 * n - 1;
		int space = 0;
		int row = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}
			row++;
			System.out.println();
			space++;
			star = star - 2;

		}

	}

}
