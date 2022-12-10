package Lec38;

import java.util.*;
import java.util.Scanner;

public class BinaryTree {
	private class Node {
		int val;
		Node left;
		Node right;

	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if (hlc) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "";
		s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}
		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);

	}

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");

	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return;
		}
		InOrder(nn.left);
		System.out.print(nn.val + " ");
		InOrder(nn.right);

	}

	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return false;
		}
		if (nn.val == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;
	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(left, Math.max(right, nn.val));
	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node nn) {
		// TODO Auto-generated method stub
//		if (nn == null) {
//			return 0;// single node ko 1 liya h
//		}
		if (nn == null) {
			return -1;
		}
		int left = ht(nn.left);
		int right = ht(nn.right);
		return Math.max(left, right) + 1;
	}

	public void LevelOrder() {
		Queue<Node> q = new LinkedList<>();
		// LinkedList<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node rv = q.remove();
			System.out.print(rv.val + " ");
			if (rv.left != null) {
				q.add(rv.left);
			}
			if (rv.right != null) {
				q.add(rv.right);
			}

		}
		System.out.println();

	}

}
