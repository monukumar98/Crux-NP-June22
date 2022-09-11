package Lec20;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		Printanswer(str, "");

	}

	public static void Printanswer(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			Printanswer(s1 + s2, ans + ch);

		}
	}
}
