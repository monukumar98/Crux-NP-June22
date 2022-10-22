package Lec29;
public class PerSon_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		Person p = new Person();
		p.Intro_yourSelf();
		p.name = "Tinku";
		p.age = -23;
		p.Intro_yourSelf();
		Person p1 = new Person();
		p1.name = "Pinku";
		p1.age = 22;
		p1.Intro_yourSelf();
		p1.SayHey("Kaju");
		p.SayHey("Kaju");
		//Person.fun("Motu",34);
		Person.fun();
		Person p2 = new Person("Kamlesh",16);
		p2.name="LoL";
		
		
	}

}
