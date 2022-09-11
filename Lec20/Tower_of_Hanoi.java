package Lec20;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		TOH(n, "A", "B", "C");

	}

	public static void TOH(int n, String src, String hel, String des) {
		if(n==0) {
			return ;
		}
		
		TOH(n-1, src, des,hel);
		System.out.println("Move "+n+"th disc from "+src +" to "+des);
		TOH(n-1, hel, src,des);

	}
 
}
