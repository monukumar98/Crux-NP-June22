package Lec56;

public class Check_IthBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 67;
		int i = 2;

		int mask = (1 << i);
		if ((n & mask) == 0) {
			System.out.println("Unset");
		} else {
			System.out.println("Set");
		}

	}

}
