package Lec42;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder sb = new StringBuilder("Hello");
		StringBuilder sb = new StringBuilder();

		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.length());
		sb.append('a');
		sb.append(true);
		sb.append(1);
		System.out.println(sb);
		sb.append("helo");
		sb.append(1+2);
		System.out.println(sb);
		sb.append('k');
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		System.out.println(sb.substring(1,3));
		String s=sb.toString();// builder to String
		//System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.replace(1, 3,"abc"));
		
		
	}

}
