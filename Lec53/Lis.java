package Lec53;

public class Lis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));
	}

	public static int lis(int[] arr) {
		int[] ans = new int[arr.length];
		ans[0] = arr[0];
		int len = 1;
		for (int i = 1; i < ans.length; i++) {
			if(arr[i]>ans[len-1]) {
				ans[len]=arr[i];
				len++;
			}
			else {
				int idx = Search(ans,0,len-1, arr[i]);
				ans[idx]=arr[i];
			}

		}
		return len;
	}

	private static int Search(int[] ans, int i, int j, int item) {
		// TODO Auto-generated method stub
		int idx=0;
		while(i<=j) {
			int mid = (i+j)/2;
			if(ans[mid]>=item) {
				idx=mid;
				j=mid-1;
			}
			else {
				i=mid+1;
			}
		}
		return idx;
	}

}
