package Lec42;

public class Preorder_and_Inorder {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

		}

		public TreeNode CreateTree(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
			if (ilo > ihi || plo > phi) {
				return null;
			}
			TreeNode node = new TreeNode();
			node.val = pre[plo];
			int idx = Search(in, ilo, ihi, pre[plo]);
			int net = idx - ilo;
			node.left = CreateTree(pre, plo + 1, plo + net, in, ilo, idx - 1);
			node.right = CreateTree(pre, plo + net + 1, phi, in, idx + 1, ihi);
			return node;

		}

		public int Search(int[] in, int si, int ei, int item) {

			for (int i = 0; i < in.length; i++) {
				if (in[i] == item) {
					return i;
				}
			}

			return 0;
		}
	}
}
