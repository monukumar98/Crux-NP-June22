package Lec41;

public class BinarySearch_Tree {
	public class Node {
		int val;
		Node left;
		Node right;

	}

	private Node root;

	public BinarySearch_Tree(int[] arr) {
		this.root = CrateTree(arr, 0, arr.length - 1);
	}

	private Node CrateTree(int[] arr, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}
		int mid = (si + ei) / 2;
		Node nn = new Node();
		nn.val = arr[mid];
		nn.left = CrateTree(arr, si, mid - 1);
		nn.right = CrateTree(arr, mid + 1, ei);

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

	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50,60,70,80,90};
		BinarySearch_Tree bst = new BinarySearch_Tree(arr);
		bst.Display();
		
	}

}
