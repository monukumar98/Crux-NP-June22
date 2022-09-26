package Lec23;

public class Letter_Tile_Possibilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAB";

		int[] freq = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch - 'A'] = freq[ch - 'A'] + 1;

		}
//		for (int i = 0; i < freq.length; i++) {
//			System.out.print(freq[i] + " ");
//		}
		System.out.println(TilePossibilities(freq, ""));

	}

	public static int TilePossibilities(int[] freq, String ans) {
		// System.out.println(ans);
		int res = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > 0) {
				char ch = (char) ('A' + i);
				freq[i]--;
				res = res + TilePossibilities(freq, ans + ch) + 1;

				freq[i]++;
			}
		}
		return res;
	}

}
