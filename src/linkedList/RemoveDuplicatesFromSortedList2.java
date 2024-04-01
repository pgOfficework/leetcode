package linkedList;

import java.util.Iterator;

/*Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]*/

import easy.ListNode;

public class RemoveDuplicatesFromSortedList2 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(4);
		ListNode l7 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l6.next = l7;

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

	// head = [1,2,3,3,4,4,5]
	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next==null) {
			return head;
		}

		ListNode start = head;
		ListNode filteredList;

		do {
			if(head.val!=head.next.val) {
			//	final=head;
				head=head.next;
			}
			else if(head.next.next!=null) {
				head=head.next.next;
			//	prev.next=head
			}
		} while (head.next!=null);

		
		return start;

	}

}
