package Lec6;

public class Bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 68;
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem = n%2;
			sum = sum + rem*mul;
			mul = mul*10;
			n=n/2;
		}
		System.out.println(sum);		

	}

}
