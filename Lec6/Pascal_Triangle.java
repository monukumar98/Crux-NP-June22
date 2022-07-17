package Lec6;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int row = 0;
		int star = 1;
		while (row < n) {
			int i = 0;
			int val = 1;
			while (i < star) {
				System.out.print(val + " ");
				val = ((row - i) * val) / (i + 1);
				i++;
			}
			row++;
			star++;
			System.out.println();
		}

	}

}
