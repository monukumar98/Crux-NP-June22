package Lec37;

public class SortList {
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
		public ListNode sortList(ListNode head) {
			if (head == null || head.next == null) {
				return head;
			}

			ListNode mid = middleNode(head);
			ListNode midnext = mid.next;
			mid.next = null;
			ListNode A = sortList(head);
			ListNode B = sortList(midnext);
			return mergeTwoLists(A, B);

		}

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

		public ListNode middleNode(ListNode head) {
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;

		}
	}

}
