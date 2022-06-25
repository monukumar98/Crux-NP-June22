package Lec2;

public class PostIncdec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		System.out.println(a++);
		System.out.println(a);
		int c = a++ + a + 6 + a-- + 5 + a;
		System.out.println(c);
		int x = 6;
		int b = x++ - x-- + 7 + x++ + x;
		System.out.println(b);

	}

}
