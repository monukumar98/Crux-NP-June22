package Lec4;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int a = 0;
		int b = 1;

		while (i <= n) {
			int c = a + b;
			a = b;
			b = c;
			i++;
		}
		System.out.println(a);

	}

}
