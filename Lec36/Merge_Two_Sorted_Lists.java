package Lec36;

public class Merge_Two_Sorted_Lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

			ListNode A = list1;
			ListNode B = list2;
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (A != null && B != null) {
				if (A.val < B.val) {
					Dummy.next = A;
					Dummy = Dummy.next;
					A = A.next;
				} else {
					Dummy.next = B;
					Dummy = Dummy.next;
					B = B.next;
				}

			}

			if (A != null) {
				Dummy.next = A;
			}
			if (B != null) {
				Dummy.next = B;
			}
			return temp.next;

		}
	}

}
