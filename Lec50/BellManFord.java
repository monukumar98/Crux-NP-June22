package Lec50;

import java.util.*;

public class BellManFord {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManFord(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
	}

	public class EdgeList {
		int v1;
		int v2;
		int cost;

		public EdgeList(int v1, int v2, int cost) {
			// TODO Auto-generated constructor stub
			this.v1 = v1;
			this.v2 = v2;
			this.cost = cost;
		}

	}

	public List<EdgeList> AllEdges() {
		List<EdgeList> ll = new ArrayList<>();
		for (int key : map.keySet()) {
			for (int nbrs : map.get(key).keySet()) {
				int cost = map.get(key).get(nbrs);
				ll.add(new EdgeList(key, nbrs, cost));
			}

		}
		return ll;
	}

	public void BellmanFord_Algo() {
		int v = map.size();
		int[] dis = new int[v + 1];
		for (int i = 2; i < dis.length; i++) {
			dis[i] = 100000;
		}
		List<EdgeList> ll = AllEdges();
		for (int i = 1; i <= v; i++) {
			for (EdgeList e : ll) {
				if (i == v && dis[e.v2] > dis[e.v1] + e.cost) {
					System.out.println("-ve Wt Cycle hai");
					return;
				}

				if (dis[e.v2] > dis[e.v1] + e.cost) {
					dis[e.v2] = dis[e.v1] + e.cost;
				}
			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(i + " " + dis[i]);

		}
	}

	public static void main(String[] args) {
		BellManFord bfd = new BellManFord(5);
		bfd.addEdge(1, 2, 8);
		bfd.addEdge(2, 5, 1);
		//bfd.addEdge(5, 2, 2);
		 bfd.addEdge(5, 2, -2);

		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
		bfd.BellmanFord_Algo();
	}

}
