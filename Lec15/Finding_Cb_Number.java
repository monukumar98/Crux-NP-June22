package Lec15;

public class Finding_Cb_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "81615";
		printSubtring(str);

	}

	public static void printSubtring(String str) {
		boolean [] visited = new boolean[str.length()];
		int count = 0;
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);
				// Integer.parseInt(s) String ko Int me convert krega
				// Long.parseLong(s)String ko long me convert krega
				if (CBnumber(Long.parseLong(s)) == true ) {
					count++;
					for (int k = i; k <j; k++) {
						visited[k]=true;
						
					}
				}

			}

		}

	}

	public static boolean CBnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}

		return true;

	}

}
