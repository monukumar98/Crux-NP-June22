package Lec45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_Two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };
		int[] ans = Intersection(arr1, arr2);

		System.out.println(Arrays.toString(ans));

	}

	public static int[] Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {

			if (map.containsKey(arr1[i])) {
				
				map.put(arr1[i], map.get(arr1[i])+1);
			} else {
				map.put(arr1[i], 1);
				
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr2.length; i++) {
			
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i] - 1));
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		return arr;

	}

}
