package Lec41;

public class Delete_Node {
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
		public TreeNode deleteNode(TreeNode root, int key) {
			if (root == null) {
				return null;
			}

			if (root.val > key) {
				root.left = deleteNode(root.left, key);
			} else if (root.val < key) {
				root.right = deleteNode(root.right, key);
			} else {
				// 1 or 0 child
				if (root.left == null) {
					return root.right;
				} else if (root.right == null) {
					return root.left;
				} else {
					int mx = max(root.left);

					root.left = deleteNode(root.left, mx);
					root.val = mx;
				}

			}
			return root;

		}

		private int max(TreeNode nn) {
			// TODO Auto-generated method stub
			if (nn == null) {
				return Integer.MIN_VALUE;
			}

			int right = max(nn.right);
			return Math.max(right, nn.val);
		}
	}
}
