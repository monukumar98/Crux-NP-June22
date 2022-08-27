package Lec17;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n);

	}
	public static void print(int n) {
		if (n == 0) {
			return;
		}
		
		print(n - 1);
		System.out.println(n);
		
	}

}
