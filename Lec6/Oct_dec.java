package Lec6;

public class Oct_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 234;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 8;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
