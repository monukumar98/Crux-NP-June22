package Lec46;

public class HAshMap_Clinet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Raj", 78);
		map.put("Ankit", 98);
		map.put("Kunal", 68);
		map.put("Amisha", 58);
		map.put("Puneet", 78);
		map.put("Pooja", 158);
		map.put("Amisha", 38);
		
		System.out.println(map);
		System.out.println(map.remove("Ankit"));
		System.out.println(map);
	}

}
