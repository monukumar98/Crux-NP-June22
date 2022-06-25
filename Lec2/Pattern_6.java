package Lec2;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int space = 0;
		int star = n;
		while (row <= n) {
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}

			// star
			int i = 1;
			while (i <= star) {
				System.out.print("*" + " ");
				i++;
			}
			// next Row
			row++;
			System.out.println();
			star--;
			space = space + 2;

		}

	}

}
