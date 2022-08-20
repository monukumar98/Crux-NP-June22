package Lec14;

public class String_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloBye";

		System.out.println(str.charAt(2));
		System.out.println(str.length());
		System.out.println(str.startsWith("He"));
		//System.out.println(comapre("Kaju", "kunal"));
		String s1="Raj123";
		String s2="123Raj";
		System.out.println(s1.compareTo(s2));
		String s3 ="Hellobyeokeywalk";
		String str1 = s3.substring(1,4);
		System.out.println(str1);
		System.out.println(s3.substring(3));
		

	}

	public static int comapre(String s1, String s2) {
		int i = 0;
		int j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) > s2.charAt(j)) {
				return 1;
			}
			else if (s1.charAt(i) < s2.charAt(j)) {
				return -1;
			}
			i++;
			j++;

		}
		return s1.length()-s2.length();

	}

}
