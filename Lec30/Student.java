package Lec30;

public class Student {
	private String name = "kmalesh";
	private int age = 90;

	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void Intro_yourSelf() {

		System.out.println("My name is " + this.name + " and age " + this.age);
	}

//	public void setage(int age) throws Exception{
//		if (age < 0) {
//			throw new Exception("Bklol age -ve nhi hota hai ");
//		}
//		
//		this.age = age;
//	}

	public void setage(int age) {
		try {
			if (age < 0) {
				throw new Exception("Bklol age -ve nhi hota hai ");
			}

			this.age = age;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("I am in finally");
		}

	}

	public int getage() {

		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
