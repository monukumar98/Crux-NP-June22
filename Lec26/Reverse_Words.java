package Lec26;

import java.util.Arrays;

public class Reverse_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "    the sky    is blue    ";
		// System.out.println(str);
		str = str.trim();
		String[] arr = str.split("\s+");
		System.out.println(Arrays.toString(arr));
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i]+" ";

		}
		s=s.trim();
		System.out.println(s);
		

	}

}
