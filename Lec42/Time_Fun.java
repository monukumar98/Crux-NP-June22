package Lec42;

public class Time_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringFun();
		StringbuilderFun();
	}

	public static void StringFun() {
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + i;

		}
		System.out.println(s);
	}

	public static void StringbuilderFun() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			s.append(i);

		}
		System.out.println(s);
	}

}
