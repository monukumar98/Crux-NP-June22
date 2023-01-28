package Lec52;

public class Edit_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "horse";
		String word2 = "ros";
		System.out.println(min_operations(word1, word2, 0, 0));

	}

	// i--> word1 j-->word2
	public static int min_operations(String word1, String word2, int i, int j) {
		if (word1.length() == i) {
			return word2.length() - j;
		}
		if (word2.length() == j) {
			return word1.length() - i;
		}
		int ans = 0;
		if (word1.charAt(i) == word2.charAt(j)) {
			ans = min_operations(word1, word2, i + 1, j + 1);
		} else {
			int D = min_operations(word1, word2, i + 1, j);
			int I = min_operations(word1, word2, i, j + 1);
			int R = min_operations(word1, word2, i + 1, j + 1);
			ans = Math.min(D, Math.min(I, R)) + 1;
		}
		return ans;
	}

}
