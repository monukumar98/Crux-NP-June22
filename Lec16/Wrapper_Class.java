package Lec16;

public class Wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 9;
		System.out.println(a);
		int x = 9;
		a = x;// normal variable to Wrapper_Class // Auto-Boxing
		int ii = 9;
		Integer a1 = 9101;
		ii = a1;// Wrapper_Class to normal variable // Un-Boxing
		System.out.println(a == x);

		Integer a2 = 89;
		Integer a3 = 89;
		Integer a4 = 589;
		Integer a5 = 589;
		System.out.println(a2 == a3);
		System.out.println(a4 == a5);

	}

}
