package Lec45;

import java.util.*;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 78);
		map.put("Ankit", 98);
		map.put("Kunal", 68);
		map.put("Amisha", 58);
		map.put("Puneet", 78);
		map.put("Pooja", 158);
		map.put("Amisha", 38);
		// map.put(null, 89);
		System.out.println(map);
//		Set<String> key = map.keySet();
//		for(String k : key) {
//			System.out.println(k+" "+map.get(k));
//		}
		//Set<String> key = map.keySet();
		for(String k : map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
		ArrayList<String> list = new ArrayList<>(map.keySet());
		System.out.println(list);
		
	
//		// get O(1)
//		System.out.println(map.get("Kunal"));
//		System.out.println(map.get("Kamlesh"));
//		// O(1)
//		System.out.println(map.containsKey("Ankita"));
//		System.out.println(map.containsKey("Ankit"));
//		// remove O(1)
//		System.out.println(map.remove("Anku"));
//		System.out.println(map.remove("Ankit"));

//		System.out.println(map);
//		TreeMap<String, Integer> map1 = new TreeMap<>();
//		// add
//		map1.put("Raj", 78);
//		map1.put("Ankit", 98);
//		map1.put("Kunal", 68);
//		map1.put("Amisha", 58);
//		map1.put("Puneet", 78);
//		map1.put("Pooja", 158);
//		map1.put("Amisha", 38);
//		// map1.put(null, 89);
//		System.out.println(map1);
//
//		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
//		// add
//		map2.put("Raj", 78);
//		map2.put("Ankit", 98);
//		map2.put("Kunal", 68);
//		map2.put("Amisha", 58);
//		map2.put("Puneet", 78);
//		map2.put("Pooja", 158);
//		map2.put("Amisha", 38);
//		// map1.put(null, 89);
//		System.out.println(map2);
		
		

	}

}
