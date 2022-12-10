package Lec39;

import java.util.*;

public class Right_Side_View {
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
		int maxd = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> ans = new ArrayList<>();
			View(root, 0, ans);
			return ans;

		}

		public void View(TreeNode root, int cl, List<Integer> ans) {
			if (root == null) {
				return;
			}

			if (maxd < cl) {
				ans.add(root.val);
				maxd = cl;
			}
			View(root.right, cl + 1, ans);
			View(root.left, cl + 1, ans);
		}
	}
}
