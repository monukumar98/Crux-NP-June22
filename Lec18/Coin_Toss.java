package Lec18;

public class Coin_Toss {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		CoinToss(n, "");
		System.out.println(count);

	}

		public static void CoinToss(int n, String ans) {
			if (n == 0) {
				System.out.print(ans + " ");
				count++;
				return;
			}
	
			CoinToss(n - 1, ans + "H");
			CoinToss(n - 1, ans + "T");
	
		}

}
