package Lec1;

public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 67;
		if (marks >= 75) {
			System.out.println("Grade A");
		} else if (marks >= 65 && marks < 75) {
			System.out.println("Grade B");
		} else if (marks >= 55 && marks < 65) {
			System.out.println("Grade c");
		} else if (marks >= 45 && marks < 55) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}

	}

}
