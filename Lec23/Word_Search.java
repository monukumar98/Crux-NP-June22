package Lec23;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean ans = WordSeach(board, word, i, j, 0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}
				}

			}
		}

	}

	public static boolean WordSeach(char[][] board, String word, int cr, int cc, int idx) {
		if (idx == word.length()) {
			return true;
		}
		if (cr < 0 || cc < 0 || cc >= board[0].length || cr >= board.length || board[cr][cc] != word.charAt(idx)) {
			return false;
		}
		int[] r = { -1, 1, 0, 0 };
		int[] c = { 0, 0, -1, 1 };
		board[cr][cc] = '*';
		for (int i = 0; i < c.length; i++) {
			boolean ans = WordSeach(board, word, cr + r[i], cc + c[i], idx + 1);
			if (ans == true) {
				return ans;
			}
		}
		board[cr][cc] = word.charAt(idx);

		return false;
	}

}
