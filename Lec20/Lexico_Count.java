package Lec20;

public class Lexico_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		PrintCouting(n, 0);

	}

	public static void PrintCouting(int n, int curr) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			PrintCouting(n, curr * 10 + i);
		}

	}

}
