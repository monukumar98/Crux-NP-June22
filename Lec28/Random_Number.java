package Lec28;

import java.util.Random;

public class Random_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		
		int lo = 100;
		int hi = 100;
		for (int i = 0; i < 15; i++) {
			int r = rn.nextInt(hi - lo + 1) + lo;
			System.out.print(r + " ");
		}

	}

}
