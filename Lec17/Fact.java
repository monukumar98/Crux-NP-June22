package Lec17;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}

	public static int fact(int n) {
         if(n==0) {
        	 return 1;
         }
		int fn = fact(n - 1);
		return fn * n;

	}

}
