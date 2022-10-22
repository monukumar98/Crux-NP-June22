package Lec29;

public class Person {
	String name = "Riya";
	int age = 23;

	public void Intro_yourSelf() {
		int rollno = 78;

		System.out.println("My name is " + name + " and age " + age);
	}

	public void SayHey(String name) {
		System.out.println(name + " say hey " + this.name);
	}

	public static void fun() {

		Person p = new Person();
		System.out.println("Fun " + p.name + " " + p.age);
	}

	public Person() {

	}
	public Person(String name, int age) {

		this.name=name;
		this.age=age;
	}

}
