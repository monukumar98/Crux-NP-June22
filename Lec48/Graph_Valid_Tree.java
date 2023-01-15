package Lec48;

import java.util.*;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());
			}
			for (int[] a : edges) {
				int a1 = a[0];
				int a2 = a[1];
				map.get(a1).add(a2);
				map.get(a2).add(a1);
			}
			return isVaild(map);

		}

		public boolean isVaild(HashMap<Integer, List<Integer>> map) {
			HashSet<Integer> visited = new HashSet<>();
			Queue<Integer> q = new LinkedList<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				q.add(src);
				while (!q.isEmpty()) {
					// 1 remove
					int rv = q.poll();
					// 2 ignore if Already visited
					if (visited.contains(rv)) {
						return false;
					}
					// 3 visited
					visited.add(rv);

					// 5 add unvisited nbrs
					for (int nbrs : map.get(rv)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}

				}
			}
			return count == 1;

		}
	}
}
