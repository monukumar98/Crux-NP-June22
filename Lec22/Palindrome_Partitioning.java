package Lec22;

import java.util.*;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new  ArrayList<>();
		Partitioning(str, list,ans);
		System.out.println(ans);

	}

	public static void Partitioning(String ques, List<String> list,List<List<String>> ans  ) {
		if (ques.length() == 0) {
			//System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (ispalindrome(s) == true) {
				list.add(s);
				Partitioning(ques.substring(i), list,ans);
				list.remove(list.size()-1);
			}
		}

	}
	public static boolean ispalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}
