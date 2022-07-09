package Lec4;

import java.util.Scanner;

public class Use_of_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 2;
		int fact = 0;
		while (i < n) {

			if (n % i == 0) {
				fact++;
				break;
			}

			i++;
		}

		if (fact == 0) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
