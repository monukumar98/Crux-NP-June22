package Lec55;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababababaaba";
		int k = 3;
		int flipa = Maxlength(str, 'a', k);
		int flipb = Maxlength(str, 'b', k);
		System.out.println(Math.max(flipa, flipb));

	}

	public static int Maxlength(String str, char ch, int k) {
		int si = 0, ei = 0;
		int flip = 0, ans = 0;
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}

			while (flip > k) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			ans = Math.max(ans, ei - si + 1);
			ei++;
		}
		return ans;

	}

}
