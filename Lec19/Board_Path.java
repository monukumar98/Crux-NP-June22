package Lec19;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		// BoardPath(0, n, "");
		System.out.println(BoardPathCount(0, n, ""));

	}

	public static void BoardPath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
//		BoardPath(curr + 1, end, ans + 1);
//		BoardPath(curr + 2, end, ans + 2);
//		BoardPath(curr + 3, end, ans + 3);

		for (int dice = 1; dice <= 3; dice++) {
			BoardPath(curr + dice, end, ans + dice);
		}
	}

	public static int BoardPathCount(int curr, int end, String ans) {
		if (curr == end) {
			// System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}
//		BoardPath(curr + 1, end, ans + 1);
//		BoardPath(curr + 2, end, ans + 2);
//		BoardPath(curr + 3, end, ans + 3);
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count += BoardPathCount(curr + dice, end, ans + dice);
		}
		return count;
	}

}
