package Lec48;

import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_Bipartite {
	class BipartitePair {
		int vtx;
		int lv;
	}

	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, Integer> visited = new HashMap<>();
			Queue<BipartitePair> q = new LinkedList<>();
			for (int src = 0; src < graph.length; src++) {
				if (visited.containsKey(src)) {
					continue;
				}
				BipartitePair bp = new BipartitePair();
				bp.vtx = src;
				bp.lv = 0;
				q.add(bp);
				while (!q.isEmpty()) {
					// 1 remove
					BipartitePair rv = q.poll();
					// 2 ignore if Already visited
					if (visited.containsKey(rv.vtx)) {
						if (visited.get(rv.vtx) != rv.lv) {
							return false;
						}

						continue;
					}
					// 3 visited
					visited.put(rv.vtx, rv.lv);

					// 5 add unvisited nbrs
					for (int nbrs : graph[rv.vtx]) {
						if (!visited.containsKey(nbrs)) {
							BipartitePair np = new BipartitePair();
							np.vtx = nbrs;
							np.lv = rv.lv + 1;
							q.add(np);
						}
					}

				}
			}
			return true;

		}

	}

}
