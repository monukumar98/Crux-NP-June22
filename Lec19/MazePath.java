package Lec19;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int m = 4;
		System.out.println("\n"+mazepath(0, 0, n - 1, m - 1, ""));// n*m ki matrix

	}

	public static int mazepath(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.print(ans + " ");
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int h = mazepath(cr, cc + 1, er, ec, ans + "H");
		int v = mazepath(cr + 1, cc, er, ec, ans + "V");
		return h + v;

	}

}
