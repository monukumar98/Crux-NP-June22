package Lec21;

public class QueenPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int q = 2;
		Printanswer(board, q, 0, "");

	}

	public static void Printanswer(boolean[] board, int tq, int qpsf, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;// Queen placed

				Printanswer(board, tq, qpsf + 1, ans+"b"+i+"q"+qpsf);
				board[i]=false;// Undo
			}

		}

	}

}
