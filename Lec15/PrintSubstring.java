package Lec15;

public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		print(str);

	}

	public static void print(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if (ispalindrome(s) == true) {
					System.out.println(s);
				}
			}
		}
	}

	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
