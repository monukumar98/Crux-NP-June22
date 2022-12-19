package Lec42;

import java.util.*;

public class Level_Order {

	public class Node {
		int val;
		Node left;
		Node right;
	}

	private Node root;

	public Level_Order() {
		// TODO Auto-generated constructor stub
		root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		Queue<Node> q = new LinkedList<>();
		Node nn = new Node();
		nn.val = item;
		root = nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node rn = q.remove();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node node = new Node();
				node.val=c1;
				rn.left=node;
				q.add(node);
			}
			if(c2!=-1) {
				Node node = new Node();
				node.val=c2;
				rn.right=node;
				q.add(node);
			}
			
			
			
		}
		
		return root;
		
		

	}

}
