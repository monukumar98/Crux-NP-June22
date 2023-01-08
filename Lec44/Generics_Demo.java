package Lec44;

public class Generics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 2, 3, 5, 1, 7 };
		Display(arr);
		String[] a = { "Rahul", "Ankit", "Kunal", "Amisha", "Raj" };
		Display(a);
		Pair<String, Integer> p = new Pair<>();

	}

	public static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

}
