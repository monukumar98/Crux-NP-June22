package Lec18;

public class Print_Sub_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		print(str, "");

	}

	public static void print(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = ques.charAt(0);// abc ka 'a' aayega
		print(ques.substring(1), ans);
		print(ques.substring(1), ans + ch);

	}
}
