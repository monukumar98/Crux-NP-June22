package Lec24;

public class check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 91;
		System.out.println(isprime(n));

	}

	public static boolean isprime(int n) {

		int div = 2;
		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
