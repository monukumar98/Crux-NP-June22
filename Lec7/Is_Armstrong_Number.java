package Lec7;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrongNumber(n));
	}

	public static boolean IsArmstrongNumber(int n) {
		int d = Countofdigit(n);
		int sum = 0;
		int temp=n;
		while (n != 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, d));
			n = n / 10;
		}

		return sum == temp;

	}

	public static int Countofdigit(int n) {

		int count = 0;
		while (n != 0) {
			count++;
			n = n / 10;
		}
		return count;

	}

}
