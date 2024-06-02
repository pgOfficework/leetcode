package linkedList;

import java.util.Iterator;

import easy.ListNode;

/*Input: head = [1,1,2,3,3]
Output: [1,2,3]*/
public class RemoveDuplicatesFromSortedList {

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

		ListNode head = deleteDuplicates(l1);

		System.out.println();

		while (true) {
			System.out.println(head.val);
			head = head.next;
			if (head.next == null) {
				System.out.println(head.val);
				break;
			}
		}

	}

	public static ListNode deleteDuplicates(ListNode head) {
		
		if(head==null) {
			return head;
		}

		ListNode start = head;
		

		do {
			if (head.val == head.next.val && head.next.next != null) {
				head.next = head.next.next;

			} else if (head.val == head.next.val) {
				head.next = null;
				return start;
			} else {
				head = head.next;
			}
		} while (head.next != null);
		return start;

	}

}
