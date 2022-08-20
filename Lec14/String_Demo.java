package Lec14;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = "Hello";
		System.out.println(str);
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		System.out.println(str == str2);
		System.out.println(str == str1);
		System.out.println(str3 == str2);
		System.out.println(str.equals(str3));
		String s = 10+"bye" + 30+20 +"Hello"+ (8+7);
		System.out.println(s);

	}

}
