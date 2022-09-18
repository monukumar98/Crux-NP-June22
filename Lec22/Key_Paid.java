package Lec22;

public class Key_Paid {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		printKeyPaid(str, "");

	}

	public static void printKeyPaid(String ques, String ans) {
		// TODO Auto-generated method stub
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		String press=key[ch-'0'];
		for (int i = 0; i < press.length(); i++) {
			printKeyPaid(ques.substring(1), ans+press.charAt(i));
			
		}
		
	}
}
