package Lec32;

public class Method_OverLoading {
	public static void main(String[] args) {
		System.out.println(add(2, 3));
		System.out.println(add(2, 3, 8));
		System.out.println(add(2, 3, 9.0f));
		System.out.println(add(2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 9, 9, 9, 9, 9));
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static int add(int a, int b, float c) {
		return (int) (a + b + c);
	}

	public static int add(int b,int k, int... a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
