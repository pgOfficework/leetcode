package linkedList;
/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

import easy.ListNode;

// @lc code=start
/**
 * Definition for singly-linked list. class ListNode { int val; ListNode next;
 * ListNode(int x) { val = x; next = null; } }
 */
public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {

		if (head.next == null) {
			return false;
		}
		if (head.next.next == null) {
			return false;
		}

		ListNode slow = head.next;
		ListNode fast = head.next.next;
		if (slow == fast)
			return true;

		while (true) {
			if (slow == fast) {
				return true;
			} else {

				if (slow.next == null) {
					return false;
				} else {
					slow = slow.next;
				}
				if (fast.next.next == null) {
					return false;
				} else {
					fast = fast.next.next;
				}
			}
		}

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1); // listA = [4,1,8,4,5], listB = [5,6,1,8,4,5],
		ListNode l2 = new ListNode(1);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(3);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		hasCycle(l1);

		System.out.println();

//		while (true) {
//			System.out.println(head.val);
//			head = head.next;
//			if (head.next == null) {
//				System.out.println(head.val);
//				break;
//			}
//		}

	}
}
// @lc code=end
