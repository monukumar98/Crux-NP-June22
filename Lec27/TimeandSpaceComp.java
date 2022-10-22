package Lec27;

public class TimeandSpaceComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000000; i++) {
//
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		int n = 10000;
		System.out.println(9);
		System.out.println(9);
		System.out.println(9);
		System.out.println(9);
		System.out.println(9);
		System.out.println(9);

		int i = 0;
		while (i < n) {
			System.out.println("Hey");
			// O(N)
			i++;
		}
		while (i < n) {
			System.out.println("Hey");
			// Log(N)
			i *= 2;
		}
		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// Log(N)
		}

		while (i <= n) {
			System.out.println("Hey");

			i += 2;
			i += 3;
			// O(N)
		}
		while (i <= n) {
			System.out.println("Hey");

			i *= 2;
			i *= 3;
			// Log(N) base 6
		}
		while (n > 0) {
			System.out.println("Hey");
			// Log(N) base 6
			n /= 2;
			n /= 3;
		}

		while (i <= n) {
			System.out.println("Hey");
			// (O)(N/K)
			i += k;
		}
		while (i <= n) {
			System.out.println("Hey");
			// Log(N) base k
			i *= k;
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.println("hey");
			}
		}

		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// O(Sqrt(N))
		}

		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("hey");
				// O(N^2)
			}
		}
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					// O(N^4)
				}
			}
		}
		
		for(i=n/2; i<=n; i++) {
			for(int j=1; j<=n/2; j++) {
				for(int k=1; k<=n; k=k*2) {
					System.out.println("hey");
					
					// N^logn
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// O(n*log(N)
			}
		}
		

		// bubble
		// Selection
		// instersion

	}

}
