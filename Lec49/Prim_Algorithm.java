package Lec49;

import java.util.*;



public class Prim_Algorithm {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Prim_Algorithm(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}

	public class PrimsPair {
		int vtx;
		int acqvtx;
		int cost;

		public PrimsPair(int vtx, int acqvtx, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.cost = cost;
			this.acqvtx = acqvtx;
		}
		@Override
		public String toString() {
			return this.vtx+" "+this.acqvtx+" @ "+this.cost;
		}
	}

	public void PrimsAlgo() {
		HashSet<Integer> visited = new HashSet<>();
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost-o2.cost;
			}
		});
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
			PrimsPair rp = pq.poll();
			if (visited.contains(rp.vtx)) {
				continue;
			}
			visited.add(rp.vtx);
			System.out.println(rp);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int cost = map.get(rp.vtx).get(nbrs);
					PrimsPair np = new PrimsPair(nbrs, rp.vtx, cost);
					pq.add(np);
				}
			}

		}
	}

	public static void main(String[] args) {
		Prim_Algorithm g = new Prim_Algorithm(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.PrimsAlgo();
	}

}
